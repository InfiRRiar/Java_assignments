package ru.mirea.lab_20;

import java.util.HashMap;

public class GenericBox<T, V, K> {
    private T Ttype;
    private V Vtype;
    private K Ktype;

    GenericBox(T Ttype, V VType, K Ktype) {
        this.Ttype = Ttype;
        this.Vtype = VType;
        this.Ktype = Ktype;
    }
    public void printValues(){
        System.out.println("1. " + Ttype.getClass() + ": " + Ttype);
        System.out.println("2. " + Vtype.getClass() + ": " + Vtype);
        System.out.println("3. " + Ktype.getClass() + ": " + Ktype);
    }

}
