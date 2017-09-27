package com.company;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class URLForTxtRegex {
    URL sourceURL;
    URLForTxtRegex(String inputURL)
    {
        try{sourceURL = new URL(inputURL);}
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
    }
    public void getTxt()
    {
        try
        {
            //初始化输出文件demo.txt
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(new File("demoRegex.txt"))));
            //初始化正则
            Pattern pattern = Pattern.compile("《[^}]*》");

            String buf, str, Title="", thisTitle="";
            boolean flag = false, ExistNewPage = true, SetTitle = true, readTitle=true;

            while(ExistNewPage) {
                readTitle = true;
                InputStreamReader InputStreamR = new InputStreamReader(sourceURL.openStream(), "gbk");
                BufferedReader readIn = new BufferedReader(InputStreamR);
                Matcher matcher = pattern.matcher("");
                ExistNewPage = false;

                //首先取得书的标题
                while (!(null == (buf = readIn.readLine())))
                {

                    pattern = Pattern.compile("《[^}]*》");
                    matcher = pattern.matcher(buf);
                    if(matcher.find())
                    {
                        thisTitle = matcher.group();
                        out.println(thisTitle);
                        break;
                    }
                }
                //如果是第一次读取这本书，则设置标题，并输出提示
                if(SetTitle)
                {
                    System.out.println("开始下载：" + thisTitle);
                    Title = thisTitle;
                    SetTitle = false;
                    readTitle = false;
                }
                //如果不第一次读取这本书，但是是第一次读取这个页面，则比较标题是否相同
                else if(readTitle && thisTitle.equals(Title)==false)
                {
                    break;
                }
                System.out.print("■");

                //开始读取正文
                while (!(null == (buf = readIn.readLine())))
                {
                    buf = new String(buf.getBytes(), "utf-8");
                    str = buf;
                    //出现这个颜色的地方表示正文开始，flag表示开始读取
                    pattern = Pattern.compile("#dc143c");
                    matcher = pattern.matcher(buf);
                    if(matcher.find())
                    {
                        flag = true;
                    }

                    if (flag) {
                        //出现这个颜色的地方表示正文结束，flag表示停止读取
                        pattern = Pattern.compile("#EBEBE4");
                        matcher = pattern.matcher(str);
                        if(matcher.find())
                        {
                            flag = false;
                        }

                        //删除<>中间的内容
                        pattern = Pattern.compile("<[^}]*>");
                        matcher = pattern.matcher(buf);
                        if(matcher.find())
                        {
                            str = str.replaceAll("<[^}]*>", "");
                        }
                        //处理完成后写入文件中
                        out.println(str);
                    }

                    //开始判断是否进入下一章，如果存在下一页
                    pattern = Pattern.compile("下一页");
                    matcher = pattern.matcher(str);
                    if(matcher.find())
                    {
                        //并且下一页指向的是下一章的网址
                        pattern = Pattern.compile("\\d{6}.html");
                        matcher = pattern.matcher(str);
                        if(matcher.find())
                        {
                            //准备链接 进入下一章
                            String NextPageNum = matcher.group();
                            int EndOfPermanentURL = sourceURL.toString().lastIndexOf('/');
                            String PermanentURL = sourceURL.toString().substring(0,EndOfPermanentURL+1);
                            sourceURL = new URL(PermanentURL + NextPageNum);
                            ExistNewPage = true;
                        }
                    }
                }
            }
            //提示下载完成
            System.out.println(" 100% ");
            out.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }




}
