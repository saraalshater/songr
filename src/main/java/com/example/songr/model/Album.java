package com.example.songr.model;

public class Album {
    private String title;
    private String artist;
    private int songCount;
    private int length;
    private String imgUrl;




    public Album(String title, String artist, int songCount, int length, String imgUrl) {
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

    public double getLength(int i){
        return length;
    }

    public String getImgUrl(){
        return imgUrl;
    }

    public void setTitle(String migrant_birds){
        this.title=title;
    }

    public void setArtist(String artist){
        this.artist= this.artist;
    }
    public void setSongCount(int i){
        this.songCount=songCount;
    }

    public void setLength(){
        this.length= length;
    }
    public void setImgUrl(String s){
        this.imgUrl=imgUrl;
    }


}
