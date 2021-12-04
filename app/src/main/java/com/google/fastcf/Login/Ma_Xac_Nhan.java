package com.google.fastcf.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.fastcf.R;

public class Ma_Xac_Nhan extends AppCompatActivity {
    Button btnxntt;
    EditText edtmxn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_xac_nhan);
        getSupportActionBar().hide();
        btnxntt= (Button) findViewById(R.id.buttonmxn_tt);
        edtmxn =(EditText) findViewById(R.id.edittext1);

        btnxntt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double ktra = Double.parseDouble(edtmxn.getText().toString().trim());
                if (ktra == 12345) {
                    Intent thongtin = new Intent(Ma_Xac_Nhan.this, Thong_tin_ca_nhan.class);
                    startActivity(thongtin);
                }else{
                    Toast.makeText(Ma_Xac_Nhan.this, "Mã xác nhận bạn nhập sai", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}