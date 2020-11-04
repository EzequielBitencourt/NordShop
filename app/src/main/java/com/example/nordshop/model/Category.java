package com.example.nordshop.model;

public class Category {
    public final int id;
    public final String description;

    public static final int TYPE_SURVIVALHORROR = 1;
    /*
    Colocar outros types
    public static final int
    public static final int
    public static final int
    */

    public Category(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
