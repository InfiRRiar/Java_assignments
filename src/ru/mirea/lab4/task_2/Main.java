package ru.mirea.lab4.task_2;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Clothes> allClothes = new ArrayList<Clothes>();

        allClothes.add(new TShirt());
        allClothes.add(new Pants());
        allClothes.add(new Skirt());
        allClothes.add(new Tie());

        Atelier atelier = new Atelier(allClothes);
        atelier.DressWoman();
        System.out.println("--------------------------------");
        atelier.DressMan();
    }
}
