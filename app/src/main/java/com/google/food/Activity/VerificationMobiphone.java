package com.google.food.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.food.R;

public class VerificationMobiphone extends AppCompatActivity {
    Button btn_next;
    EditText edt_mxn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_mobiphone);
         edt_mxn = (EditText) findViewById(R.id.edt_mxn);
         btn_next = (Button) findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt_mxn.getText().toString().equals("12345"))
                {
                    Intent intent = new Intent(VerificationMobiphone.this,MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(VerificationMobiphone.this, "Nhập thành công", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(VerificationMobiphone.this, "Bạn đã nhập sai ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}