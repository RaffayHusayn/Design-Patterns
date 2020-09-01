package com.raffaypackage;
public class ShapeFactory {

   public Shape getShape(String str){
       if(str.equals("circle")){
           return new Circle();
       }
       else if(str.equals("Square")){
           return new Square();
       }
       else{
           System.out.println("this is not a fucking shape");
           return null;
       }

   }
}