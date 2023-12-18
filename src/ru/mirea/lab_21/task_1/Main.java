package ru.mirea.lab_21.task_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] lines = {"a", "b", "c"};
        List<String> res = transform(lines);
        System.out.println(res);

        Integer[] nums = {1, 2, 3};
        List<Integer> res1 = transform(nums);
        System.out.println(res1);
    }
    public static <Object> List<Object> transform(Object[] e){
        List<Object> res = new ArrayList<>();
        Collections.addAll(res, e);
        return res;
    }

}
