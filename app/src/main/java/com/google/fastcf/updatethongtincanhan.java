package com.google.fastcf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class updatethongtincanhan extends AppCompatActivity {
    Button btnupdate,btnql;
    EditText edtname,edtgt,edtemail,edtsdt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_updatethongtincanhan);
        anhxa();
        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tenmoi = edtname.getText().toString();
                String sdtmoi = edtsdt.getText().toString();
                String gioitinhmoi = edtgt.getText().toString();
                String emailmoi = edtemail.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("tenmoine", tenmoi);
                intent.putExtra("sdtmoine", sdtmoi);
                intent.putExtra("gioitinhmoi", gioitinhmoi);
                intent.putExtra("emailmoi", emailmoi);

                setResult(RESULT_OK, intent);
                finish();
            }
        });
        btnql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(updatethongtincanhan.this,Thongtincanhan1.class);
            }
        });
    }

    private void anhxa() {
        btnupdate = findViewById(R.id.buttonasave_ttcn);
        edtname = findViewById(R.id.edit_name);
        edtsdt = findViewById(R.id.edit_mobi);
        edtgt = findViewById(R.id.edit_gt);
        edtemail = findViewById(R.id.edit_email);
        btnql= findViewById(R.id.button2);
    }
}