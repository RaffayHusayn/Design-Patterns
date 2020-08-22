package com.raffaypackage;

public class House implements HousePlan {
    String basement;
     String structure;
    String interior;

    public void setBasement(String basement) {
        this.basement = basement;
    }

    @Override
    public void setStructure(String structure) {
        this.structure = structure;
    }

    @Override
    public void setInterior(String interior) {
        this.interior =interior;
    }


}
