package com.google.fastcf.DatHang;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.fastcf.R;

public class Gio_hang extends AppCompatActivity {
    Button btnqlgh,dathang;
    EditText ttgh;
    View dh;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gio_hang);
        getSupportActionBar().hide();
        Anhxa();
        btnqlgh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Gio_hang.this, Chon_Mon.class);
                startActivity(intent);
            }
        });
        dathang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Gio_hang.this, "Đặt hàng thành công", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void Anhxa() {

        btnqlgh = (Button) findViewById(R.id.buttonql_giohang);
        dathang =(Button) findViewById(R.id.dathang);
        dh = findViewById(R.id.dh);
        ttgh = findViewById(R.id.thongtingiaohang);
    }
}