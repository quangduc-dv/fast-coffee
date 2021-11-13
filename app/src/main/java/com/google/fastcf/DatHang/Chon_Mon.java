package com.google.fastcf.DatHang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import com.google.fastcf.R;
import com.google.fastcf.Trang_chu;

import java.util.ArrayList;

public class Chon_Mon extends AppCompatActivity {
    Button btnqlaicm,btngiohang;
    GridView gvProduct;
    ArrayList<SanPham> arraysappham;
    SanPhamAdaptar adaptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chon_mon);
        getSupportActionBar().hide();
        AnhXa();
        adaptar = new SanPhamAdaptar(this,R.layout.dong_sanpham,arraysappham);
        gvProduct.setAdapter(adaptar);
        btnqlaicm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Chon_Mon.this, Trang_chu.class);
                startActivity(intent);
            }
        });
        btngiohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Chon_Mon.this, Gio_hang.class);
                startActivity(intent);
            }
        });
    }


    private void AnhXa() {
        btnqlaicm = (Button) findViewById(R.id.buttonql_chonmon);
        btngiohang=(Button) findViewById(R.id.button_giohang);
        gvProduct = (GridView) findViewById(R.id.gridview_Product);
        arraysappham= new ArrayList<>();
        arraysappham.add(new SanPham("Coffe","50000","Đ",R.drawable.thucdon));
        arraysappham.add(new SanPham("Trà sữa ","30000","Đ",R.drawable.trasua));
        arraysappham.add(new SanPham("Trà sữa 1","25000","Đ",R.drawable.images1));
        arraysappham.add(new SanPham("Trà sữa 2","500000","Đ",R.drawable.images2));
        arraysappham.add(new SanPham("Trà sữa 3","500000","Đ",R.drawable.images3));
        arraysappham.add(new SanPham("Trà sữa 4","43000","Đ",R.drawable.images4));
        arraysappham.add(new SanPham("Trà sữa 5 ","250000","Đ",R.drawable.images6));
        arraysappham.add(new SanPham("Trà sữa 6","10000","Đ",R.drawable.images7));
        arraysappham.add(new SanPham("Trà sữa 7","30000","Đ",R.drawable.images8));
        arraysappham.add(new SanPham("Coffe","50000","Đ",R.drawable.thucdon));
        arraysappham.add(new SanPham("Trà sữa ","30000","Đ",R.drawable.trasua));
        arraysappham.add(new SanPham("Trà sữa 1","25000","Đ",R.drawable.images1));
        arraysappham.add(new SanPham("Trà sữa 2","500000","Đ",R.drawable.images2));
        arraysappham.add(new SanPham("Trà sữa 3","500000","Đ",R.drawable.images3));
        arraysappham.add(new SanPham("Trà sữa 4","43000","Đ",R.drawable.images4));
        arraysappham.add(new SanPham("Trà sữa 5 ","250000","Đ",R.drawable.images6));
        arraysappham.add(new SanPham("Trà sữa 6","10000","Đ",R.drawable.images7));
        arraysappham.add(new SanPham("Trà sữa 7","30000","Đ",R.drawable.images8));



    }
}