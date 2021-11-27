package com.google.fastcf.DatHang.Lienhe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.fastcf.R;
import com.google.fastcf.User.Thongtinkhach;

public class Lienhe extends AppCompatActivity {
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lienhe);
        getSupportActionBar().hide();
        btnback = (Button) findViewById(R.id.imageView2_dau);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lienhe.this, Thongtinkhach.class);
                startActivity(intent);
            }
        });
    }
}