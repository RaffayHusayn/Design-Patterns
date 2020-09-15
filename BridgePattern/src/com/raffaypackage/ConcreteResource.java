package com.raffaypackage;

public class ConcreteResource implements MediaResource{
    String url = "media link";
    String picture = "picture link";
    String snippet = "Block of text";
    String title = "Title";

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
