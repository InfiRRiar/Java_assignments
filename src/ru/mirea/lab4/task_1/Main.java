package ru.mirea.lab4.task_1;

public class Main {
    public static void main(String[] args) {
        Season fav_season = Season.SPRING;
        System.out.println("Честно говоря, вопрос о времени года является сложным. \nПоэтому весна была выбрана методом " +
                "иключения: летом от жары деться некуда, зимой на улице некомфортно, осень просто скучная. " +
                "Весна же представляет из себя лето, но жара зачастую терпима");
        Confessions to_season = new Confessions();
        System.out.println();
        to_season.love_confession(fav_season);
        System.out.println();
        for (Season season : Season.values())
        {
            System.out.println(season + " " + season.getAvg_temperature() + "\n" + season.getDescription() + "\n");
        }
    }



}
