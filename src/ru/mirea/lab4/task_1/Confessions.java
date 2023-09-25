package ru.mirea.lab4;

public class Confessions {
    public void love_confession(Season season)
    {
        switch (season) {
            case SUMMER:
                System.out.println("I love Summer");
            case FALL:
                System.out.println("I love Fall");
            case WINTER:
                System.out.println("I love Winter");
            case SPRING:
                System.out.println("I love Spring");
        }
    }
}
