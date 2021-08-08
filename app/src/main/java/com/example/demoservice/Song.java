package com.example.demoservice;

import java.io.Serializable;

public class Song implements Serializable {
    private String name;
    private String singer;
    private int image;
    private int file;

    public Song(String name, String singer, int image, int file) {
        this.name = name;
        this.singer = singer;
        this.image = image;
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }
}
