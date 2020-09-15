package com.raffaypackage;

public class Main {

    public static void main(String[] args) {
        //Creating a long view for an artist
        System.out.println("Long View for Artist \n\n");
        MediaResource lorde = new Artist();
	    AbstractView longView = new LongFormView(lorde);
	    longView.show(lorde);
        // Creating a long view for a book
        System.out.println("\n\nLong view for Book \n\n");
        MediaResource dune = new Book();
        longView.show(dune);
        //Creating a squareView for an artist
        System.out.println("\n\nSquare view for an Artist \n\n");
        AbstractView squareView = new SquareView(dune);
        squareView.show(lorde);
        //Creating a squareView for a book
        System.out.println("\n\nSquare view for Book \n\n");
        squareView.show(dune);




    }
}
