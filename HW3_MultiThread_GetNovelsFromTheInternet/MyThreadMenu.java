package com.company;

import java.io.*;
import java.net.URL;


class MyThreadMenu implements Runnable
{
    private URL URLMenu;
    public MyThreadMenu(URL input)
    {
        this.URLMenu = input;
    }

    @Override
    public void run()
    {
        try
        {
            //初始化输出文件demo.txt和一系列变量
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(new File("demo.txt"))));
            InputStreamReader InputStreamR = new InputStreamReader(URLMenu.openStream(), "UTF-8");
            BufferedReader readIn = new BufferedReader(InputStreamR);
            String buf;

            while (!(null == (buf = readIn.readLine()))) {

                //遍历本页上存在的所有长评
                if (buf.contains("class=\"title-link\">")) {
                    int nexti = buf.indexOf("href=\"") + 6;
                    int nextj = buf.lastIndexOf("\" class=");
                    String SingleURL = buf.substring(nexti, nextj);
//                            System.out.println(SingleURL);
                    MyThreadContent myContent = new MyThreadContent(SingleURL);
                    new Thread(myContent).start();
                }
                //准备下一页的链接并创建新的线程
                if (buf.contains(">后页&gt;<")) {
                    int nexti = buf.indexOf("amp;") + 4;
                    int nextj = buf.indexOf(">") - 2;
                    String URLAdded = buf.substring(nexti, nextj);
                    System.out.println("URLAdded:" + URLAdded);
                    //如果下一章的链接确实指向下一章，而不是主目录，则创建连接准备进入

                    int EndOfPermanentURL = URLMenu.toString().lastIndexOf('&');
                    String PermanentURL = URLMenu.toString().substring(0, EndOfPermanentURL + 1);
                    URLMenu = new URL(PermanentURL + URLAdded);
                    System.out.println("URLMenu:" + URLMenu);
                    MyThreadMenu myMenu = new MyThreadMenu(URLMenu);
                    new Thread(myMenu).start();
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

