package com.google.fastcf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chitietdonhang extends AppCompatActivity {
    Button btnql;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitietdonhang);
        anhxa();
        btnql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chitietdonhang.this,lichsugiaohang.class);
                startActivity(intent);
            }
        });
    }

    private void anhxa() {
        btnql = findViewById(R.id.playbackCT1);
    }
}