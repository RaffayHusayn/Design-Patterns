package com.raffaypackage;

public class Main {

    public static void main(String[] args) {

        MediaResource lorde = new Artist();
	    AbstractView longView = new LongFormView(lorde);
	    longView.show(lorde);

	    MediaResource dune = new Book();
	    AbstractView squareView = new SquareView(dune);
	    squareView.show(dune);
    }
}
