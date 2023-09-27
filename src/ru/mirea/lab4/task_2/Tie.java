package ru.mirea.lab4.task_2;

public class Tie extends Clothes implements MenClothing{

    Tie() {
        this.setType("Tie");
        DressMan();
    }
    @Override
    public void DressMan() {
        this.setColor("Black");
        this.setPrice(3000);
        this.setSize("L");
    }
}
