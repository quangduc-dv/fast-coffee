package com.google.fastcf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thongbaott2 extends AppCompatActivity {
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongbaott2);
        getSupportActionBar().hide();
        btnback = findViewById(R.id.playbackCT2);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongbaott2.this,Trang_chu.class);
                startActivity(intent);
            }
        });
    }
}