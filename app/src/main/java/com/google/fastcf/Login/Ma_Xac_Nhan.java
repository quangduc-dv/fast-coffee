package com.google.fastcf.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.fastcf.R;

public class Ma_Xac_Nhan extends AppCompatActivity {
    Button btnxntt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_xac_nhan);
        getSupportActionBar().hide();
        btnxntt= (Button) findViewById(R.id.buttonmxn_tt);
        btnxntt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thongtin = new Intent(Ma_Xac_Nhan.this, Thong_tin_ca_nhan.class);
                startActivity(thongtin);
            }
        });
    }
}