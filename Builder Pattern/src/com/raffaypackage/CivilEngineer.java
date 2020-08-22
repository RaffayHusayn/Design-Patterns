package com.raffaypackage;

public class CivilEngineer {
    HouseBuilder houseBuilder;
    public CivilEngineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    public House getHouse(){
        return this.houseBuilder.getHouse();
    }
    public void constructHouse(){
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildInterior();
        this.houseBuilder.buildStructure();
    }
}
