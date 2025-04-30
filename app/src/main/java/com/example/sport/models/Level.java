package com.example.sport.models;

import java.io.Serializable;
import java.util.List;

public class Level implements Serializable {
    private int id;
    private String name;
    private boolean locked;
    private List<Exercise> exercises;

    public Level(int id, String name, boolean locked, List<Exercise> exercises) {
        this.id = id;
        this.name = name;
        this.locked = locked;
        this.exercises = exercises;
    }

    // Геттеры
    public int getId() { return id; }
    public String getName() { return name; }
    public boolean isLocked() { return locked; }
    public List<Exercise> getExercises() { return exercises; }
}