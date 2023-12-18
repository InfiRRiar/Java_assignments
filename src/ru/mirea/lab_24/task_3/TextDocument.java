package ru.mirea.lab_24.task_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextDocument implements IDocument{
    public TextDocument() throws IOException {
        Files.createFile(Path.of("D:\\RTU_MIREA\\term_3\\java\\src\\ru\\mirea\\lab_24\\task_3\\1.txt"));
        System.out.println("Был создан txt файл");
    }

    @Override
    public void save() {
        System.out.println("Текстовый файл был сохранён");
    }

    @Override
    public void exit() {
        System.out.println("Был совершён выход из текстового файла");
    }
}
