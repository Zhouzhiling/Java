package com.company;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {

        /*用正则表达式实现*/
        //创建连接
       URLForTxtRegex url1 = new URLForTxtRegex("http://www.kanunu8.com/book3/6646/116158.html");
       //得到文本内容
       url1.getTxt();
       //文本格式修改和标记语言删除
       deleteUnnecessary("demoRegex.txt","afterTrimRegex.txt");

        /*用Java内置函数实现*/
        URLForTxt url2 = new URLForTxt("http://www.kanunu8.com/book4/8583/188412.html");
        //得到文本内容
        url2.getTxt();
        //文本格式修改和标记语言删除
        deleteUnnecessary("demo.txt","afterTrim.txt");

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

                out.println(str2.trim());
            }
            out.close();


        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
