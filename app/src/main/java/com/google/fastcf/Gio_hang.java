package com.google.fastcf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gio_hang extends AppCompatActivity {
    Button btnqlgh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gio_hang);
        getSupportActionBar().hide();
        Anhxa();
        btnqlgh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Gio_hang.this,Chon_Mon.class);
                startActivity(intent);
            }
        });
    }

    private void Anhxa() {
        btnqlgh = (Button) findViewById(R.id.buttonql_giohang);
    }
}