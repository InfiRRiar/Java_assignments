package ru.mirea.lab4.task_2;

public class TShirt extends Clothes implements MenClothing, WomenClothing{


    TShirt() {
        this.setType("T-shirt");
        DressMan();
        DressWoman();
    }
    @Override
    public void DressMan() {
        this.setColor("Grey");
        this.setPrice(2000);
        this.setSize("M");
    }

    @Override
    public void DressWoman() {
        this.setColor("White");
        this.setPrice(2000);
        this.setSize("S");
    }
}
