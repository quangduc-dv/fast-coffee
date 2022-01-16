package com.google.food.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.google.food.Adapter.diachiAdapter;
import com.google.food.DiaChiDaTa;
import com.google.food.Domain.DiaChi;
import com.google.food.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class dia_chi extends AppCompatActivity {
    Button  btnback,btnThem;
    String urlGetDiachi = "http://192.168.1.2:8080/ltdt/getDiachi.php";
    ListView lvDiachi;
    ArrayList<DiaChi> arrayDiachi;
    diachiAdapter adapter;
    DiaChiDaTa database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_chi);
        btnback = (Button) findViewById(R.id.playbackDC);
        btnThem = (Button) findViewById(R.id.btnThem1);
        lvDiachi = (ListView) findViewById(R.id.listviewDiachi);
        //tạo database
        //database = new DiaChiDaTa(this, "coffe.sqlite",null,1);
        //tạo bảng
        //database.queryData("CREATE TABEL IF NOT EXISTS DiaChi(Id INTERGER PRIMARY KEY AUTOINCREMENT, DiaDiem VARCHAR(50), diachi VARCHAR(50), Ten VARCHAR(50), SDT INTERGER) ");
        //database.queryData("INSERT INTO DiaChi VALUES(null,'nhà riêng','hải lăng','tâm',1234567890)");

        arrayDiachi = new ArrayList<>();
        adapter = new diachiAdapter(this, R.layout.activity_dia_chi_item,arrayDiachi);
        lvDiachi.setAdapter(adapter);
        GetDiachi(urlGetDiachi);
        getdata(urlGetDiachi);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dia_chi.this, Account.class);
                startActivity(intent);
            }
        });
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dia_chi.this, dia_chi_them.class);
                startActivity(intent);
            }
        });
    }
    private void getdata(String url){
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Toast.makeText(dia_chi.this, response.toString(), Toast.LENGTH_SHORT).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(dia_chi.this, "Lỗi", Toast.LENGTH_SHORT).show();
                    }
                }

        );
        requestQueue.add(jsonArrayRequest);
    }
    private void GetDiachi(String url){
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        for(int i = 0; i< response.length(); i++){
                            try {
                                JSONObject object= response.getJSONObject(i);
                                arrayDiachi.add(new DiaChi(
                                        object.getInt("Id"),
                                        object.getString("Location"),
                                        object.getString("Address"),
                                        object.getString("Name"),
                                        object.getString("Phone_number")
                                ));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        adapter.notifyDataSetChanged();

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(dia_chi.this, error.toString(), Toast.LENGTH_SHORT).show();
                    }
                }

        );
        requestQueue.add(jsonArrayRequest);
    }


}