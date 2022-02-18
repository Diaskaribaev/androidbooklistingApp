package com.example.booklistingapp;

public class Book {

    private int imageid;
    private String author;
    private String name;
    private String language;
    private String cost;


    public Book(int imageid1,String author1,String name1,String language1,String cost1) {
        imageid = imageid1;
        author =author1;
        name = name1;
        language = language1;
        cost = cost1;

    }

    public int getImageid() {
        return imageid;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public String getCost() {
        return cost;
    }
}
