package ru.mirea.lab_24.task_3;

import java.io.IOException;
import java.io.File;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() throws IOException {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() throws IOException {
        return new TextDocument();
    }
}
