package ru.mirea.lab_24.task_3;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImageDocument implements IDocument {
    public ImageDocument() throws IOException {
        Files.createFile(Path.of("D:\\RTU_MIREA\\term_3\\java\\src\\ru\\mirea\\lab_24\\task_3\\1.jpg"));
        System.out.println("Был создан jpg файл");
    }

    @Override
    public void save() {
        System.out.println("Картинковый файл был сохранён");
    }

    @Override
    public void exit() {
        System.out.println("Был совершён выход из картинкового файла");
    }
}
