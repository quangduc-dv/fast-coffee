package com.google.fastcf.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.fastcf.R;
import com.google.fastcf.Trang_chu;

public class Thong_tin_ca_nhan extends AppCompatActivity {
    Button btnsave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_ca_nhan);
        getSupportActionBar().hide();
        Anhxa();
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent xacnhan_save = new Intent(Thong_tin_ca_nhan.this, Trang_chu.class);
                startActivity(xacnhan_save);
            }
        });

    }

    private void Anhxa() {
        btnsave=(Button) findViewById(R.id.buttonasave_ttcn);
    }
}