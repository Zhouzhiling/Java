package com.company;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try
        {
            MyThreadMenu myMenu = new MyThreadMenu(new URL("https://movie.douban.com/subject/25966044/reviews?sort=hotest&start=600"));
            new Thread(myMenu, "beginning").start();
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
    }
}
