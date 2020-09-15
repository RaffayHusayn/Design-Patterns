package com.raffaypackage;


public class LongFormView extends AbstractView {
    public LongFormView(MediaResource resource) {
        super(resource);
    }


    @Override
    public void show(MediaResource resource) {

        System.out.println("--------------------------");
        System.out.println("Title :" + resource.title());
        System.out.println("--------------------------");
        System.out.println("--------------------------");
        if(resource.resourceType() == "artist") {
            System.out.println("Bio: " + resource.snippet());

        } else if (resource.resourceType() == "book"){
            System.out.println("Summary: "+ resource.snippet());
        }
        System.out.println("--------------------------");

    }
}
