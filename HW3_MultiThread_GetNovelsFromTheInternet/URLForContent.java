package com.company;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLForContent{
    private URL sourceURL;

    URLForContent(String inputURL)
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

    public void getTxt () throws IOException
    {
            //初始化输出文件demo.txt和一系列变量
            String buf, str;

            InputStreamReader InputStreamR = new InputStreamReader(sourceURL.openStream(), "utf-8");
            BufferedReader readIn = new BufferedReader(InputStreamR);

            //首先取得书的标题，在href="<span property="v:summary">"的下一行
            while (!(null == (buf = readIn.readLine())))
            {

                if (buf.contains("<span property=\"v:summary\">"))
                    break;
            }

            //记录标题在字符串中的前后位置，然后用Substring取出
            int TitleStart = buf.indexOf('>');
            int TitleEnd = buf.indexOf("</span>");
            String ThisTitle = buf.substring(TitleStart+1,TitleEnd);
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(new File("Source\\"+ThisTitle+".txt"))));
            out.println(ThisTitle);
            System.out.println("开始下载：" + ThisTitle);

            //开始读取正文
            while (!(null == (buf = readIn.readLine()))) {
                buf = new String(buf.getBytes(), "utf-8");
                int i ,j ;
                //出现这个颜色的地方表示正文开始，flag表示开始读取
                if (buf.contains("data-original=\"1\">"))
                {
                    buf = readIn.readLine();
                    buf = buf.replaceAll("<br>","\n");

                    str = "";
                    while ((i = buf.indexOf("<")) >= 0)
                    {
                        j = buf.indexOf(">");
                        str += buf.substring(0, i);
                        buf = buf.substring(j + 1);
                    }
                    str += buf;
                    //处理完成后写入文件中
                    out.println(str);
                    break;
                }
            }
            //提示用户下载完成
        out.close();
            deleteUnnecessary("Source\\"+ThisTitle+".txt","New\\"+ThisTitle+".txt");
            System.out.println("Download Done!");
            out.close();
    }

    public static void deleteUnnecessary(String input,String output)
    {
        BufferedReader reader = null;
        try
        {
            reader = new BufferedReader(new FileReader(new File(input)));
            String str2 = "";

            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(new File(output))));

            while(!((str2 = reader.readLine())==null))
            {
                //删除纯空格的行
                if(str2.trim().length() == 0)
                    continue;
                //替换&nbsp;为空格
                Pattern pattern = Pattern.compile("&nbsp;");
                Matcher matcher = pattern.matcher(str2);
                if(matcher.find())
                {
                    str2 = str2.replaceAll("&nbsp;"," ");
                }
                //替换&quot;为引号
                pattern = Pattern.compile("&quot;");
                matcher = pattern.matcher(str2);
                if(matcher.find())
                {
                    str2 = str2.replaceAll("&quot;","\"");
                }
                //替换<br>为换行
                pattern = Pattern.compile("<br>");
                matcher = pattern.matcher(str2);
                if(matcher.find())
                {
                    str2 = str2.replaceAll("<br>","\r\n");
                }

                out.println(str2);
            }
            out.close();


        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }

//    @Override
//    public void run()
//    {
//        try {
//            getTxt ();
//        }catch (IOException e)
//        {
//
//        }
//
//    }
}
