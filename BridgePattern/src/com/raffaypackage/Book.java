package com.raffaypackage;

public class Book implements MediaResource {

    String url = "media link";
    String picture = "picture link";
    String snippet = "Block of text";
    String title = "Flowers for Algernon";
    String type;

    public Book(){
        this.type= "book";
    }

    @Override
    public String resourceType() {
        return type;
    }

    @Override
    public String snippet() {
        return snippet;
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public String title() {
        return title;
    }

    @Override
    public String picture() {
        return picture;
    }

}
