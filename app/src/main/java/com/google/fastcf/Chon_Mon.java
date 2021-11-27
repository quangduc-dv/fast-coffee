package com.google.fastcf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chon_Mon extends AppCompatActivity {
    Button btnqlaicm,btngiohang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chon_mon);
        getSupportActionBar().hide();
        AnhXa();
        btnqlaicm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Chon_Mon.this,Trang_chu.class);
                startActivity(intent);
            }
        });
        btngiohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Chon_Mon.this,Gio_hang.class);
                startActivity(intent);
            }
        });
    }

    private void AnhXa() {
        btnqlaicm = (Button) findViewById(R.id.buttonql_chonmon);
        btngiohang=(Button) findViewById(R.id.button_giohang);
    }
}