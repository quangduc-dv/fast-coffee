package com.google.food.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.food.R;

public class MethodLogin extends AppCompatActivity {
    Button btnsdt,btnfb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_login);
        btnsdt=(Button) findViewById(R.id.btnlgsdt);
        btnsdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MethodLogin.this, Mobiphone.class);
                startActivity(intent);
            }
        });
    }
}