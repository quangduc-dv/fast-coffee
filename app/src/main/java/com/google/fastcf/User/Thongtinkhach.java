package com.google.fastcf.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.fastcf.DatHang.Lienhe.Lienhe;
import com.google.fastcf.R;
import com.google.fastcf.Start.MainActivity;
import com.google.fastcf.Trang_chu;

public class Thongtinkhach extends AppCompatActivity {
    Button  btnqlttk,btndangxuat;
    TextView txtlh;

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
    }

    private void Anhxa() {
        btnqlttk = (Button) findViewById(R.id.playbackttk);
        txtlh =(TextView) findViewById(R.id.textViewlh);
        btndangxuat=(Button) findViewById(R.id.button_dxtt);
    }
}