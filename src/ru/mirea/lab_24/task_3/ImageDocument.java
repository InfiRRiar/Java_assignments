package ru.mirea.pr24.ex2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImageDocument implements IDocument {
    public ImageDocument() throws IOException {
        Files.createFile(Path.of("/Users/aleksandrapresnyakova/Desktop/приктика24//image.jpg"));
        System.out.println("Был создан jpg файл");
    }
}
