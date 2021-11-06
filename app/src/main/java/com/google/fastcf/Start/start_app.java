package com.google.fastcf.Start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.fastcf.R;

public class start_app extends AppCompatActivity {
    Button btntartapp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_start_app);
        btntartapp=(Button) findViewById(R.id.btnstart);
        btntartapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(start_app.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}