package com.raffaypackage;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HouseBuilder igloo = new IglooHouseBuilder();
        HouseBuilder hut = new WoodHouse();
        CivilEngineer engineer = new CivilEngineer(igloo);
        engineer.constructHouse();
        engineer.getHouse();
        CivilEngineer hutEngineer = new CivilEngineer(hut);
        hutEngineer.constructHouse();
        hutEngineer.getHouse();

    }
}
