package ru.mirea.lab4.task_2;

public class Skirt extends Clothes implements WomenClothing {

    Skirt() {
        this.setType("Skirt");
        DressWoman();
    }

    @Override
    public void DressWoman() {
        this.setColor("Black");
        this.setPrice(2500);
        this.setSize("XS");
    }

}
