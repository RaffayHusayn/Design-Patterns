package com.raffaypackage;

public class WoodHouse implements HouseBuilder{
    House house;
    public WoodHouse(){
        house = new House();
    }
    @Override
    public void buildBasement() {
        this.house.setBasement("wood basement");
    }

    @Override
    public void buildStructure() {
        this.house.setStructure("wood walls");
    }

    @Override
    public void buildInterior() {
        this.house.setInterior("wood decor");
    }

    @Override
    public House getHouse() {
        System.out.println(house.basement);
        System.out.println(house.interior);
        System.out.println(house.structure);
        return this.house;
    }
}
