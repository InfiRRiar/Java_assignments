package ru.mirea.lab_13.task_6;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String path = args[0];

        try(BufferedReader reader = new BufferedReader(new FileReader(path)))
        {
            List<String> words = new ArrayList<String>();
            String[] line = reader.readLine().split(" ");
            Collections.addAll(words, line);
            System.out.println(getLine(words));

        } catch (FileNotFoundException e) {
            System.out.println("Не удалось найти файл");
        } catch (IOException e) {
            System.out.println("Не удалось открыть файл");
        }
    }

    public static String getLine(List<String> arr)
    {
        boolean is_found = true;

        for (int i = 0; i < arr.size(); i++)
        {
            StringBuilder line = new StringBuilder(arr.get(i) + " ");
            String last_word = line.toString().substring(0, line.length() - 1);
            List<Integer> usedInd = new ArrayList<Integer>();
            usedInd.add(i);
            is_found = true;

            while (usedInd.size() < arr.size() && is_found)
            {
                is_found = false;
                for (int j = 0; j < arr.size(); j++)
                {
                    if (arr.get(j).toLowerCase().charAt(0) == last_word.toLowerCase().charAt(last_word.length() - 1) && !(usedInd.contains(j)))
                    {
                        is_found = true;
                        last_word = arr.get(j);
                        line.append(last_word).append(" ");
                        usedInd.add(j);
                    }
                }
            }
            if (usedInd.size() == arr.size())
            {
                return line.toString();
            }
        }
        return "-----";
    }

}
