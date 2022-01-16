package com.google.food;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.food.Activity.Account;
import com.google.food.Activity.UpdatePSActivity;

public class PersonActivity extends AppCompatActivity {
    Button btnsave,btnquaylai;
    TextView txtName,txtsdt,txtgt,txtgmail;
    int REQUEST_CODE_EDIT = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        Anhxa();
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PersonActivity.this, UpdatePSActivity.class);
                startActivityForResult(intent,REQUEST_CODE_EDIT);
            }
        });
        btnquaylai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PersonActivity.this, Account.class);
                startActivity(intent);
            }
        });

    }

    private void Anhxa() {
        btnsave=(Button) findViewById(R.id.buttonasave_ttcn);
        txtName = findViewById(R.id.edit_name);
        txtsdt = findViewById(R.id.edit_mobi);
        txtgt = findViewById(R.id.edit_gt);
        txtgmail = findViewById(R.id.edit_email);
        btnquaylai = findViewById(R.id.button2);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == REQUEST_CODE_EDIT && resultCode == RESULT_OK && data != null){
            String ten=data.getStringExtra("tenmoine");
            String sdt=data.getStringExtra("sdtmoine");
            String gioitinh=data.getStringExtra("gioitinhmoi");
            String email=data.getStringExtra("emailmoi");
            txtName.setText(ten);
            txtsdt.setText(sdt);
            txtgt.setText(gioitinh);
            txtgmail.setText(email);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}