package ru.mirea.lab_24.task_3;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MusicDocument implements IDocument{
    public MusicDocument() throws IOException {
        Files.createFile(Path.of("D:\\RTU_MIREA\\term_3\\java\\src\\ru\\mirea\\lab_24\\task_3\\1.mp3"));
        System.out.println("Был создан mp3 файл");
    }

    @Override
    public void save() {
        System.out.println("Музыкальный файл был сохранён");
    }

    @Override
    public void exit() {
        System.out.println("Был совершён выход из музыкального файла");
    }
}
