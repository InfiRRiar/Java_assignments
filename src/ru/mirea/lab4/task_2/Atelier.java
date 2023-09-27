package ru.mirea.lab4.task_2;

import java.util.List;


public class Atelier implements MenClothing, WomenClothing {

    private List<Clothes> allClothes;

    Atelier(List<Clothes> allClothes) {
        this.allClothes = allClothes;
    }

    @Override
    public void DressMan() {
        for (Clothes cloth : allClothes) {
            if (cloth instanceof MenClothing) {
                System.out.println("Type: " + cloth.getType() + "\nSize: " + cloth.getSize() + "\nPrice: " +
                        +cloth.getPrice() + "\nColor: " + cloth.getColor() + "\n");
            }
        }
    }

    @Override
    public void DressWoman() {
        for (Clothes cloth : allClothes) {
            if (cloth instanceof WomenClothing) {
                System.out.println("Type: " + cloth.getType() + "\nSize: " + cloth.getSize() + "\nPrice: " +
                        +cloth.getPrice() + "\nColor: " + cloth.getColor() + "\n");
            }
        }
    }
}
