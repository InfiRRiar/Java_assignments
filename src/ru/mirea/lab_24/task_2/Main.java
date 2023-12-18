package ru.mirea.lab_24.task_2;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client();
        Client client2 = new Client();
        Client client3 = new Client();
        Chair chair1 = ChairFactory.getChair(new VictorianChairFactory());
        Chair chair2 = ChairFactory.getChair(new MagicalChairFactory());
        Chair chair3 = ChairFactory.getChair(new MultifunctionalChairFactory());
        client1.sit(chair1);
        client2.sit(chair2);
        client3.sit(chair3);
    }
}
