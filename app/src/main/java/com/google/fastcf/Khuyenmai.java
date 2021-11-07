package com.google.fastcf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.fastcf.User.Thongtinkhach;

public class Khuyenmai extends AppCompatActivity {
    TextView txtql;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khuyenmai);
        getSupportActionBar().hide();
        txtql = findViewById(R.id.playbackCT1);
        txtql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent   intent = new Intent(Khuyenmai.this, Thongtinkhach.class);
                startActivity(intent);
            }
        });
    }
}