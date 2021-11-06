package com.google.fastcf.TinTuc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.fastcf.R;
import com.google.fastcf.Trang_chu;

public class thongbaott1 extends AppCompatActivity {
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongbaott1);
        getSupportActionBar().hide();
        btnback = findViewById(R.id.playbackCT1);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongbaott1.this, Trang_chu.class);
                startActivity(intent);
            }
        });
    }
}