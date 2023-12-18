package ru.mirea.lab_24.task_3;
import java.io.IOException;

public interface ICreateDocument {
    IDocument createNew() throws IOException;
    IDocument createOpen() throws IOException;
}
