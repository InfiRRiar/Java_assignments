package ru.mirea.pr24.ex2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextDocument implements IDocument{
    public TextDocument() throws IOException {
        Files.createFile(Path.of("Users/aleksandrapresnyakova/Desktop/приктика24//text.txt"));
        System.out.println("Был создан txt файл");
    }
}
