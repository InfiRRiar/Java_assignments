package ru.mirea.lab3.task_2;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Tester {
    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<Circle>() {
        };
        for (int i = 0; i < 10; i++) {
            circles.add(new Circle());
        }

        for (Circle circle : circles) {
            System.out.print(circle.getRadius() + " ");
        }

        System.out.println(max_circle(circles).getRadius());
        System.out.println(min_circle(circles).getRadius());

        System.out.println();
        sort(circles);

        for (Circle circle : circles) {
            System.out.print(circle.getRadius() + " ");
        }
    }

    public static List<Circle> sort(List<Circle> circles) {
        circles.sort(Comparator.comparingInt(Circle::getRadius));
        return circles;
    }

    public static Circle min_circle(List<Circle> circles) {
        Circle min = circles.get(0);
        for (int i = 2; i < circles.size(); i++) {
            if (min.getRadius() > circles.get(i).getRadius()) min = circles.get(i);
        }
        return min;
    }

    public static Circle max_circle(List<Circle> circles) {
        Circle max = circles.get(0);
        for (int i = 2; i < circles.size(); i++) {
            if (max.getRadius() < circles.get(i).getRadius()) max = circles.get(i);
        }
        return max;
    }


}
