package com.google.food.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.food.R;

public class Mobiphone extends AppCompatActivity {
    Button btnttsdt;
    EditText edtsdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobiphone);
        edtsdt = findViewById(R.id.edittext1);
        btnttsdt=(Button) findViewById(R.id.buttonxnsdt);
        btnttsdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtsdt.getText().toString().equals("0123456789"))
                {
                    Intent intent = new Intent(Mobiphone.this,VerificationMobiphone.class);
                    startActivity(intent);
                    Toast.makeText(Mobiphone.this, "Nhập thành công", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(Mobiphone.this, "Bạn đã nhập sai số điện thoại", Toast.LENGTH_SHORT).show();
            }
        });
    }
}