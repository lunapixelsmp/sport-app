package com.example.sport;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sport.adapters.LevelAdapter;
import com.example.sport.models.Exercise;
import com.example.sport.models.Level;

import java.util.ArrayList;
import java.util.List;

public class LevelSelectionActivity extends AppCompatActivity {
    private final List<Level> levels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_selection);

        createLevels();
        setupRecyclerView();
    }

    private void createLevels() {
        // Уровень 1
        List<Exercise> level1Exercises = new ArrayList<>();
        level1Exercises.add(new Exercise(1, "Отжимания", "3 подхода по 10 раз", 30, R.drawable.pushup));
        level1Exercises.add(new Exercise(2, "Приседания", "3 подхода по 15 раз", 45, R.drawable.squat));
        levels.add(new Level(1, "Новичок", false, level1Exercises));

        // Уровень 2
        List<Exercise> level2Exercises = new ArrayList<>();
        level2Exercises.add(new Exercise(3, "Планка", "Держать 1 минуту", 60, R.drawable.plank));
        level2Exercises.add(new Exercise(4, "Подтягивания", "3 подхода по 5 раз", 90, R.drawable.squat));
        levels.add(new Level(2, "Продолжающий", false, level2Exercises));

        // Добавьте остальные уровни (3-5) аналогично
    }

    private void setupRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.levelsRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        LevelAdapter adapter = new LevelAdapter(levels, level -> {
            Intent intent = new Intent(LevelSelectionActivity.this, ExerciseActivity.class);
            intent.putExtra("level", level);
            startActivity(intent);
        });
        recyclerView.setAdapter(adapter);
    }
}