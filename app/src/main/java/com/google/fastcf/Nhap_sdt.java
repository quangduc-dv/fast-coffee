package com.google.fastcf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nhap_sdt extends AppCompatActivity {
    Button btnttsdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_sdt);
        getSupportActionBar().hide();

        //Ánh xạ
        btnttsdt=(Button) findViewById(R.id.buttonxnsdt);
        btnttsdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Nhap_sdt.this,Ma_Xac_Nhan.class);
                startActivity(intent);
            }
        });
    }
}