package com.google.fastcf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.google.fastcf.DatHang.Chon_Mon;
import com.google.fastcf.List_tintuc.NoiDung;
import com.google.fastcf.List_tintuc.NoiDungAdaptar;
import com.google.fastcf.Maps.diachi;
import com.google.fastcf.TinTuc.thongbaott1;
import com.google.fastcf.TinTuc.thongbaott2;
import com.google.fastcf.User.Thongtinkhach;

import java.util.ArrayList;

public class Trang_chu extends AppCompatActivity {
    Button btnMaps,btndatmon,btnusername;
    ListView lvNoiDung;
    ArrayList<NoiDung> arrayNoiDung;
    NoiDungAdaptar adaptar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);
        getSupportActionBar().hide();
        AnhXa();
        adaptar = new NoiDungAdaptar(this,R.layout.dong_noi_dung,arrayNoiDung);
        lvNoiDung.setAdapter(adaptar);

        lvNoiDung.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==1)
                {
                    Intent intent =new Intent(Trang_chu.this, thongbaott1.class);
                    startActivity(intent);
                }
                if(i==2)
                {
                    Intent intent =new Intent(Trang_chu.this, thongbaott2.class);
                    startActivity(intent);
                }
            }
        });
        //ĐIền Maps
        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Trang_chu.this, diachi.class);
                startActivity(intent);
            }
        });
        btndatmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Trang_chu.this, Chon_Mon.class);
                startActivity(intent);
            }
        });
        btnusername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Trang_chu.this, Thongtinkhach.class);
                startActivity(intent);
            }
        });
    }

    private void AnhXa() {
        btnusername=(Button) findViewById(R.id.button_user);
        btndatmon = (Button) findViewById(R.id.buttondathang);
        btnMaps = (Button) findViewById(R.id.imageButtonmaps);
        lvNoiDung = (ListView) findViewById(R.id.listviewnoidung);
        arrayNoiDung=new ArrayList<>();
        arrayNoiDung.add(new NoiDung("","","",R.drawable.atm));
        arrayNoiDung.add(new NoiDung("Tin tức","THƯỞNG THỨC CAFE RANG XAY & TÚI LỌC  CỦA FAST","Fast luôn cố gắng không ngừng để cho ra sản phẩm phù hợp với nhịp sống hiện đại",R.drawable.imgtt1));
        arrayNoiDung.add(new NoiDung(" ","THƯỞNG THỨC KEM GELATO NGON CHUẨN Ý TẠI FAST CHỈ VỚI 30.000Đ","Fast luôn cố gắng không ngừng để cho ra sản phẩm phù hợp với nhịp sống hiện đại",R.drawable.imgtt2));
        arrayNoiDung.add(new NoiDung("","ƯU ĐÃI 50% TẾT NAY THÊM RỘN RÀNG","Fast luôn cố gắng không ngừng để cho ra sản phẩm phù hợp với nhịp sống hiện đại",R.drawable.imgtt3));
        arrayNoiDung.add(new NoiDung("","TẾT SUNG TÚC CHẠM VỊ XUÂN","",R.drawable.imgtt4));
        arrayNoiDung.add(new NoiDung("","FAST COFFEE - 30 TRẦN DOẢN,QUẬN 20 XIN CHÀO","",R.drawable.imgtt5));
        arrayNoiDung.add(new NoiDung("","NHÂN ĐÔI NIỀM VUI GIÁNG SINH- TẶNG 40% LY THỨ 2","Fast luôn cố gắng không ngừng để cho ra sản phẩm phù hợp với nhịp sống hiện đại",R.drawable.imgtt6));

    }


}