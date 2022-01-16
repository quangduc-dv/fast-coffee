package com.google.food.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.food.Fragment.GiaodichFragment;
import com.google.food.PersonActivity;
import com.google.food.R;

public class Account extends AppCompatActivity {
    Button  btnqlttk,btndangxuat;
    TextView txtlh,txtkm,txtttcn,textViewdcgh,textViewlsgh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        btnqlttk = (Button) findViewById(R.id.playbackttk);
        txtlh =(TextView) findViewById(R.id.textViewlh);
        btndangxuat=(Button) findViewById(R.id.button_dxtt);
        txtkm = findViewById(R.id.textViewkm);
        txtttcn = findViewById(R.id.account);
        textViewdcgh = findViewById(R.id.textViewdcgh);
        textViewlsgh = findViewById(R.id.textViewlsgh);
        menuapp();
        txtttcn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Account.this, PersonActivity.class);
                startActivity(intent);
            }
        });
        btnqlttk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Account.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btndangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Account.this, IntroActivity.class);
                startActivity(intent);
            }
        });
        txtlh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Account.this,LienHe.class);
                startActivity(intent);

            }
        });
        txtkm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Account.this,Supportsms.class);
                startActivity(intent);
            }
        });
        textViewlsgh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Account.this, Supportsms.class);
                startActivity(intent);
            }
        });
        textViewdcgh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Account.this, dia_chi.class);
                startActivity(intent);
            }
        });
    }
    private void menuapp() {
        LinearLayout homeBtn = findViewById(R.id.homeBtn);
        LinearLayout accountbtn = findViewById(R.id.btn_account);
        accountbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Account.this,Account.class));
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Account.this, MainActivity.class));
            }
        });

    }
}