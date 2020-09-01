package com.raffaypackage;

public class Main {

    public static void main(String[] args) {
	ShapeFactory factorymethod = new ShapeFactory();
	Shape shape1 = factorymethod.getShape("circle");
	shape1.draw();
    }
}
