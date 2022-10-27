package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class QuestionNaireActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_naire);
        Button checkBoxesBtn = findViewById(R.id.checkboxes_btn);
        checkBoxesBtn.setOnClickListener(view -> {
            Intent checkBoxesIntent = new Intent(this,CorrectAnswerActivity.class);
            startActivity(checkBoxesIntent);
        });
        Button radioBtn = findViewById(R.id.rediobutto_btn);
        radioBtn.setOnClickListener(view -> {
            Intent radioBtnIntent = new Intent(this,CheckBoxesCorrectAnswerActivity.class);
            startActivity(radioBtnIntent);
        });
    }
}