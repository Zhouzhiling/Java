package com.company;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class URLForTxt {
    URL sourceURL;
    URLForTxt(String inputURL)
    {
        try
        {
            sourceURL = new URL(inputURL);
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
    }
    public void getTxt()
    {
        try
        {
            //初始化输出文件demo.txt和一系列变量
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(new File("demo.txt"))));
            String buf, str, Title="";
            boolean flag = false, ExistNewPage = true, SetTitle = true, readTitle ;
            int i,j;

            //while还有下一章
            while(ExistNewPage)
            {
                //开始读取新的页面的时候需要重新读取标题
                readTitle = true;
                InputStreamReader InputStreamR = new InputStreamReader(sourceURL.openStream(), "gbk");
                BufferedReader readIn = new BufferedReader(InputStreamR);
                ExistNewPage = false;

                //首先取得书的标题，和href="index.html"在同一行
                while (!(null == (buf = readIn.readLine())))
                {
                    if (buf.indexOf("href=\"index.html\"") >= 0)
                        break;
                }

                //记录标题在字符串中的前后位置，然后用Substring取出
                int TitleStart = buf.indexOf('《');
                int TitleEnd = buf.indexOf('》');
                String ThisTitle = buf.substring(TitleStart,TitleEnd+1);
                //如果是第一次读取这本书，则设置标题，并输出提示
                if(SetTitle) {
                    out.println(ThisTitle);
                    System.out.println("开始下载：" + ThisTitle);
                    Title = ThisTitle;
                    SetTitle = false;
                    readTitle = false;
                }
                //如果不第一次读取这本书，但是是第一次读取这个页面，则比较标题是否相同
                else if(readTitle && ThisTitle.equals(Title)==false)
                {
                    break;
                }
                System.out.print("■");

                //开始读取正文
                while (!(null == (buf = readIn.readLine()))) {
                    buf = new String(buf.getBytes(), "utf-8");
                    //出现这个颜色的地方表示正文开始，flag表示开始读取
                    if (buf.indexOf("#dc143c") >= 0)
                        flag = true;
                    if (flag) {
                        i = j = 0;
                        str = "";
                        //出现这个颜色的地方表示正文结束，flag表示停止读取
                        if (buf.indexOf("#EBEBE4") >= 0)
                            flag = false;
                        //删除<>中间的内容
                        while ((i = buf.indexOf("<")) >= 0)
                        {
                            j = buf.indexOf(">");
                            str += buf.substring(0, i);
                            buf = buf.substring(j + 1);
                        }
                        str += buf;
                        //处理完成后写入文件中
                        out.println(str);
                    }

                    //开始判断是否进入下一章
                    if (buf.indexOf("下一页") >= 0)
                    {
                        if(buf.indexOf("href=") >=0 && buf.indexOf(".html")>=0)
                        {
                            int nexti = buf.indexOf("href=") + 6;
                            int nextj = nexti + 7;
                            String NextPageNum = buf.substring(nexti, nextj);
                            //如果下一章的链接确实指向下一章，而不是主目录，则创建连接准备进入
                            if( Character.isDigit(NextPageNum.charAt(0)))
                            {
                                int EndOfPermanentURL = sourceURL.toString().lastIndexOf('/');
                                String PermanentURL = sourceURL.toString().substring(0,EndOfPermanentURL+1);
                                sourceURL = new URL(PermanentURL + NextPageNum + "html");
                                ExistNewPage = true;
                            }
                        }
                    }

                }

            }
            //提示用户下载完成
            System.out.println(" 100% ");
            out.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
