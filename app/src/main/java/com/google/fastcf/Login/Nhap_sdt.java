package com.google.fastcf.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.fastcf.R;
import com.google.fastcf.Trang_chu;

public class Nhap_sdt extends AppCompatActivity {
    Button btnttsdt;
    EditText edtsdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_sdt);
        getSupportActionBar().hide();

        //Ánh xạ
        edtsdt = findViewById(R.id.edittext1);
        btnttsdt=(Button) findViewById(R.id.buttonxnsdt);
        {
            btnttsdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double ktra = Double.parseDouble(edtsdt.getText().toString().trim());
                if (ktra==1111111111){
                    Intent intent = new Intent(Nhap_sdt.this,Ma_Xac_Nhan.class);
                    startActivity(intent);
                Toast.makeText(Nhap_sdt.this, "Nhập thành công", Toast.LENGTH_SHORT).show();}
                else if(ktra ==1111111112)
                {
                    Intent intent = new Intent(Nhap_sdt.this, Trang_chu.class);
                    startActivity(intent);

                }
                else Toast.makeText(Nhap_sdt.this, "Bạn đã nhập sai số điện thoại", Toast.LENGTH_SHORT).show();
            }
        });
        }
    }
}