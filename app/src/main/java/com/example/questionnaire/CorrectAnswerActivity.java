package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class CorrectAnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_answer);
        Button verifyBtn = findViewById(R.id.verify_btn);
        verifyBtn.setOnClickListener(view -> {
        RadioButton radioBtn = findViewById(R.id.radiobutton1_btn);
        if (radioBtn.isChecked()) {
            Toast.makeText(this, "False", Toast.LENGTH_SHORT).show();
        }
        RadioButton radioBtn2 = findViewById(R.id.radiobutton2_btn);
        if (radioBtn2.isChecked()) {
            Toast.makeText(this, "True", Toast.LENGTH_SHORT).show();
        }
        RadioButton radioBtn3 = findViewById(R.id.radiobutton3_btn);
        if (radioBtn3.isChecked()) {
            Toast.makeText(this, "False", Toast.LENGTH_SHORT).show();
        }
        RadioButton radioBtn4 = findViewById(R.id.radiobutton4_btn);
        if (radioBtn4.isChecked()) {
            Toast.makeText(this, "False", Toast.LENGTH_SHORT).show();
        }
        });
    }
}