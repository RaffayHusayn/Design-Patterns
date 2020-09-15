package com.raffaypackage;
import java.util.Scanner;

public class Artist implements MediaResource{

    String url = "media link";
    String picture = "picture link";
    String snippet = "J cole was born in 1985";
    String title = "J Cole";
    String type;

    public Artist(){
        this.type= "artist";
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
