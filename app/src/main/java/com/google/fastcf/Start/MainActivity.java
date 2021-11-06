package com.google.fastcf.Start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.fastcf.Login.Nhap_sdt;
import com.google.fastcf.R;

public class MainActivity extends AppCompatActivity {
    Button btnsdt,btnfb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        btnsdt=(Button) findViewById(R.id.btnlgsdt);
        btnsdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Nhap_sdt.class);
                startActivity(intent);
            }
        });
    }
}