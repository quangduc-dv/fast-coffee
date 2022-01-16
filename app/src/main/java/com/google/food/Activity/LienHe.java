package com.google.food.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.food.R;

import java.util.ArrayList;
import java.util.List;

public class LienHe extends AppCompatActivity {
    Button btnql;
    ImageView call,sms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lien_he);
        checkandroid();
        btnql = findViewById(R.id.btnql);
        call = findViewById(R.id.imageView4_1);
        sms = findViewById(R.id.imageView6_1);
        menuapp();
        btnql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LienHe.this,Account.class));
            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentcall();

            }
        });
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentsend();

            }
        });
    }

    private void intentsend() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("sms:"+"addr.Itdd@gmail.com"));
        startActivity(intent);

    }

    private void checkandroid() {
        String[] permisssions = new String[]{
                Manifest.permission.CALL_PHONE,
                Manifest.permission.SEND_SMS
        };
        List<String> listpermission = new ArrayList<>();
        for (String permission:permisssions){
            if (ContextCompat.checkSelfPermission(this,permission)!= PackageManager.PERMISSION_GRANTED);
            {
                listpermission.add(permission);
            }
        }
        if (!listpermission.isEmpty());
        {
            ActivityCompat.requestPermissions(this,listpermission.toArray(new String[listpermission.size()]),1);
        }
    }

    private void intentcall() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:"+"0123456789"));
        startActivity(intent);
    }
    private void menuapp() {
        LinearLayout homeBtn = findViewById(R.id.homeBtn);
        LinearLayout accountbtn = findViewById(R.id.btn_account);
        accountbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LienHe.this,Account.class));
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LienHe.this, MainActivity.class));
            }
        });

    }
}