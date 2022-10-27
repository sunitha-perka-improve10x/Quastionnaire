package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button correctAnswerBtn = findViewById(R.id.correctanswer_btn);
        correctAnswerBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,CorrectAnswerActivity.class);
            startActivity(intent);
        });
        Button checkBoxesBtn = findViewById(R.id.checkboxes1_btn);
        checkBoxesBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,CheckBoxesCorrectAnswerActivity.class);
            startActivity(intent);
        });
        Button calenderBtn = findViewById(R.id.calendar_btn);
        calenderBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,CalendarActivity.class);
            startActivity(intent);
        });
    }
}
