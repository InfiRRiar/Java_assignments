package ru.mirea.lab_19;

public class NonValidDocument extends Exception{
    public NonValidDocument(String errorMessage){
        super(errorMessage);
    }

}
