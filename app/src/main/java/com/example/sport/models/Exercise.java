package com.example.sport.models;

import java.io.Serializable;

public class Exercise implements Serializable {
    private int id;
    private String name;
    private String description;
    private int duration;
    private int imageResId;

    public Exercise(int id, String name, String description, int duration, int imageResId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.imageResId = imageResId;
    }

    // Геттеры
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public int getDuration() { return duration; }
    public int getImageResId() { return imageResId; }
}