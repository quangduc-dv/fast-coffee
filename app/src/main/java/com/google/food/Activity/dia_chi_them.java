package com.google.food.Activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.food.R;

import java.util.HashMap;
import java.util.Map;

public class dia_chi_them extends AppCompatActivity {

    EditText edtDiaDiem,edtDiaChi, edtNguoiNhan, edtSDT;
    Button btnback, btnSave;
    String urlInsert = "http://192.168.1.2:8080/ltdt/insert.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_chi_them);


        Anhxa();
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ddiem = edtDiaDiem.getText().toString().trim();
                String dchi = edtDiaChi.getText().toString().trim();
                String nnhan = edtNguoiNhan.getText().toString().trim();
                String SDt = edtSDT.getText().toString().trim();
                if (ddiem.isEmpty()||dchi.isEmpty()||nnhan.isEmpty()||SDt.isEmpty()){
                    Toast.makeText(dia_chi_them.this, "vui lòng nhận đủ thông tin", Toast.LENGTH_SHORT).show();

                }else {
                    ThemDiaChi(urlInsert);
                }
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dia_chi_them.this,dia_chi.class);
                startActivity(intent);
            }
        });
    }
    private void ThemDiaChi(String url){
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if (response.trim().equals("Success")){
                            Toast.makeText(dia_chi_them.this, "Thêm Thành công", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(dia_chi_them.this,dia_chi.class));
                        }else {
                            Toast.makeText(dia_chi_them.this, "Thêm Thành công", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(dia_chi_them.this,dia_chi.class));
                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(dia_chi_them.this, "Xảy ra lỗi", Toast.LENGTH_SHORT).show();
                        Log.d("error", "lỗi!\n" + error.toString());
                    }
                }
        ){
            @Nullable
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params= new HashMap<>();
                params.put("Location", edtDiaDiem.getText().toString().trim());
                params.put("Address", edtDiaChi.getText().toString().trim());
                params.put("Name", edtNguoiNhan.getText().toString().trim());
                params.put("Phone_number", edtSDT.getText().toString().trim());
                return params;
            }
        };
        requestQueue.add(stringRequest);

    }
    private void Anhxa(){
        btnback = (Button) findViewById(R.id.playbackttgiaohang);
        btnSave = (Button) findViewById(R.id.btnsave);
        edtDiaDiem = (EditText) findViewById(R.id.DiaDiem);
        edtDiaChi = (EditText) findViewById(R.id.dc);
        edtNguoiNhan = (EditText) findViewById(R.id.nguoinhan);
        edtSDT = (EditText) findViewById(R.id.SoDienThoai);
    }


}