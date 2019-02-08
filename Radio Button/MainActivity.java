package com.example.akshay.radiobuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    RadioGroup Rgrp;
    Button submit;
    RadioButton Rbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Rgrp = findViewById(R.id.radioGrp);
        submit = findViewById(R.id.submit_button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int getId = Rgrp.getCheckedRadioButtonId();
                Rbutton = findViewById(getId);
                Toast.makeText(MainActivity.this,Rbutton.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });


    }
}
