package com.company;

import java.io.IOException;

class MyThreadContent implements Runnable
{

    private String URLInput;

    public MyThreadContent(String URLInput)
    {
        this.URLInput = URLInput;
    }

    @Override
    public void run()
    {
//      System.out.println(Thread.currentThread().getName());
        URLForContent url2 = new URLForContent(URLInput);
        //得到文本内容
        try
        {
            url2.getTxt();
            //文本格式修改和标记语言删除
            //deleteUnnecessary("demo.txt","afterTrim.txt");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}