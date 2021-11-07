    package com.google.fastcf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.fastcf.User.Thongtinkhach;

    public class lichsugiaohang extends AppCompatActivity {
    Button btnql,btnct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lichsugiaohang);
        getSupportActionBar().hide();
        btnql = findViewById(R.id.playbackCT1);
        btnct = findViewById(R.id.btnchitiet);
        btnql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lichsugiaohang.this, Thongtinkhach.class);
                startActivity(intent);
            }
        });
        btnct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lichsugiaohang.this, Chitietdonhang.class);
                startActivity(intent);
            }
        });
    }
}