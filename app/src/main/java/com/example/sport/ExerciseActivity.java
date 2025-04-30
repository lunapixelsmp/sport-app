package com.example.sport;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sport.adapters.ExerciseAdapter;
import com.example.sport.models.Level;

public class ExerciseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        Level level = (Level) getIntent().getSerializableExtra("level");

        if (level != null) {
            TextView levelTitle = findViewById(R.id.levelTitle);
            levelTitle.setText(level.getName());

            setupExercisesRecyclerView(level.getExercises());
        }
    }

    private void setupExercisesRecyclerView(java.util.List<com.example.sport.models.Exercise> exercises) {
        RecyclerView recyclerView = findViewById(R.id.exercisesRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ExerciseAdapter adapter = new ExerciseAdapter(exercises);
        recyclerView.setAdapter(adapter);
    }
}