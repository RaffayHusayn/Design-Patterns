package com.raffaypackage;


public class SquareView extends AbstractView{
    public SquareView(MediaResource  resource){
        super(resource);

    }
    @Override
    public void show(MediaResource resource) {
        System.out.println("+++++++++++++++++");
        System.out.println("Title :" + resource.title());

        if(resource.resourceType() == "artist") {
            System.out.println("Bio: " + resource.snippet());

        }
        else if (resource.resourceType() == "book"){
            System.out.println("Summary: "+ resource.snippet());
        }

        System.out.println("+++++++++++++++++");
    }
}
