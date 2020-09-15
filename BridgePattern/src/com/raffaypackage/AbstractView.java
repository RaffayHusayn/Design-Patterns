package com.raffaypackage;

public abstract class AbstractView{

    protected MediaResource resource;
    public AbstractView(MediaResource resource){
        this.resource = resource;
    }
    //This will be different for all the different type of view that will be created
    public abstract void show(MediaResource resource);
}
