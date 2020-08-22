package com.raffaypackage;

public class IglooHouseBuilder implements HouseBuilder {
    House house;
    public IglooHouseBuilder(){
        house = new House();
    }
    @Override
    public void buildBasement() {
        house.setBasement("ice basement");
    }

    @Override
    public void buildStructure() {
        house.setStructure("ice walls");
    }

    @Override
    public void buildInterior() {
        house.setInterior("ice decor");
    }

    @Override
    public House getHouse() {
        System.out.println(house.basement);
        System.out.println(house.interior);
        System.out.println(house.structure);
        return house;

    }
}
