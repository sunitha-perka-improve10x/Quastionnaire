package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxesCorrectAnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_boxes_correct_answer);
        Button verifyBtn = findViewById(R.id.verify_cb);
        verifyBtn.setOnClickListener(view -> {
            CheckBox mercuryCb = findViewById(R.id.mercury_cb);
            CheckBox sunCb = findViewById(R.id.sun_cb);
            CheckBox moonCb = findViewById(R.id.moon_cb);
            CheckBox jupitorCb = findViewById(R.id.jupitor_cb);
            CheckBox saturnCb = findViewById(R.id.saturn_cb);
            CheckBox plutoCb = findViewById(R.id.pluto_cb);
            if (mercuryCb.isChecked() && sunCb.isChecked() == false && moonCb.isChecked() == false && jupitorCb.isChecked() && saturnCb.isChecked() && plutoCb.isChecked() == false){
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Not correct", Toast.LENGTH_SHORT).show();
            }
        });

    }
}