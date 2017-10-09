package com.company;

public class CD extends Item {

    private String artist;
    private int numofTracks;


    public CD(String title,String artist,int numofTracks,int playingTime,String comment)
    {
        super(title,playingTime,comment,false);
        //this.title = title;
        this.artist = artist;
        this.numofTracks = numofTracks;
        //this.playingTime = playingTime;
        //this.comment = comment;
    }

    public void print()
    {
        super.print();
        System.out.println("CD : " + artist);
    }
}
