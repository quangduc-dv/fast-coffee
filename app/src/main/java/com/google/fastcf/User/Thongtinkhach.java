package com.google.fastcf.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.fastcf.Khuyenmai;
import com.google.fastcf.Lienhe.Lienhe;
import com.google.fastcf.Login.Thong_tin_ca_nhan;
import com.google.fastcf.Maps.diachi;
import com.google.fastcf.R;
import com.google.fastcf.Start.MainActivity;
import com.google.fastcf.Thongtincanhan1;
import com.google.fastcf.Trang_chu;
import com.google.fastcf.lichsugiaohang;

import org.w3c.dom.Text;

public class Thongtinkhach extends AppCompatActivity {
    Button  btnqlttk,btndangxuat;
    TextView txtlh,txtkm,txtttcn,textViewdcgh,textViewlsgh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongtinkhach);
        getSupportActionBar().hide();
        Anhxa();
        btnqlttk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Thongtinkhach.this, Trang_chu.class);
                startActivity(intent);
            }
        });
        btndangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Thongtinkhach.this, MainActivity.class);
                startActivity(intent);
            }
        });
        txtlh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Thongtinkhach.this, Lienhe.class);
                startActivity(intent);

            }
        });
        txtkm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Thongtinkhach.this, Khuyenmai.class);
                startActivity(intent);

            }
        });
        txtttcn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Thongtinkhach.this, Thongtincanhan1.class);
                startActivity(intent);

            }
        });
        textViewdcgh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Thongtinkhach.this, diachi.class);
                startActivity(intent);

            }
        });
        textViewlsgh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Thongtinkhach.this, lichsugiaohang.class);
                startActivity(intent);

            }
        });
    }

    private void Anhxa() {
        btnqlttk = (Button) findViewById(R.id.playbackttk);
        txtlh =(TextView) findViewById(R.id.textViewlh);
        btndangxuat=(Button) findViewById(R.id.button_dxtt);
        txtkm = findViewById(R.id.textViewkm);
        txtttcn = findViewById(R.id.textViewttcn);
        textViewdcgh = findViewById(R.id.textViewdcgh);
        textViewlsgh = findViewById(R.id.textViewlsgh);
    }
}