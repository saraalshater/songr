package com.example.songr.model;

public class Album {
    private String title;
    private String artist;
    private int songCount;
    private double length;
    private String imgUrl;


    public Album(String title, String artist, int songCount, double length, String imgUrl){
        this.title=title;
        this.artist=artist;
        this.songCount=songCount;
        this.length=length;
        this.imgUrl=imgUrl;

    }


    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public int getSongCount(){
        return songCount;
    }

    public double getLength(){
        return length;
    }

    public String getImgUrl(){
        return imgUrl;
    }

    public void setTitle(){
        this.title=title;
    }

    public void setArtist(){
        this.artist=artist;
    }
    public void setSongCount(){
        this.songCount=songCount;
    }

    public void setLength(){
        this.length= length;
    }
    public void setImgUrl(){
        this.imgUrl=imgUrl;
    }


}
