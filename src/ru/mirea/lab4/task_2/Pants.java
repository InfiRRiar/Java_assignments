package ru.mirea.lab4.task_2;

public class Pants extends Clothes implements MenClothing, WomenClothing{


    Pants() {
        this.setType("Pants");
        DressWoman();
        DressMan();
    }
    @Override
    public void DressMan() {
        this.setColor("Black");
        this.setPrice(1500);
        this.setSize("L");
    }

    @Override
    public void DressWoman() {
        this.setColor("Blue");
        this.setPrice(1700);
        this.setSize("S");
    }

}
