package com.company;

public class DVD extends Item {

    private String director;


    public DVD(String title,String director,int playingTime,String comment)
    {
        //super();//表示DVD会去调用父类的不带参数的构造器
        super(title,playingTime,comment,false);
        this.title = title;
        this.director = director;
        this.playingTime = playingTime;
        this.comment = comment;
    }

    public void print()
    {
        super.print();
        System.out.println("DVD : "+  director);
    }

}
