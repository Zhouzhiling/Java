package com.company;

public class Item {

    protected String title;
    protected int playingTime;
    protected boolean gotIt = false;
    protected String comment;

    public Item(String title,int playingTime,String comment,boolean gotIt)
    {
        super();
        this.gotIt = gotIt;
        this.title = title;
        this.playingTime = playingTime;
        this.comment = comment;
    }


    public void print()
    {
        System.out.println("Item : "+ title);
    }
}
