package com.google.food.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.food.Adapter.CategoryAdapter;
import com.google.food.Adapter.NoiDungAdapter;
import com.google.food.Adapter.PopularAdapter;
import com.google.food.Domain.CategoryDomain;
import com.google.food.Domain.FoodDomain;
import com.google.food.Domain.NoiDung;
import com.google.food.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView accountimg;
    Button btnMaps,btndatmon,btnusername;
    LinearLayout btnSms;
    ListView lvNoiDung;
    ArrayList<NoiDung> arrayNoiDung;
    NoiDungAdapter adaptar4;
    private RecyclerView.Adapter adapter,adapter2;
    private RecyclerView recyclerViewCategoryList,recyclerViewPopularList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewCategory();
        recyclerViewPopular();
        bottomnavigation();
        AnhXa();
        btnSms = (LinearLayout) findViewById(R.id.btn_sms);
        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Supportsms.class);
                startActivity(intent);
            }
        });
        adaptar4 = new NoiDungAdapter(this,R.layout.dong_noi_dung,arrayNoiDung);
        lvNoiDung.setAdapter(adaptar4);
        lvNoiDung.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    Intent intent =new Intent(MainActivity.this, Supportsms1.class);
                    startActivity(intent);
                }
                if(i==1)
                {
                    Intent intent =new Intent(MainActivity.this, Supportsms2.class);
                    startActivity(intent);
                }
            }
        });
        accountimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Account.class);
                startActivity(intent);
            }
        });
    }

    private void bottomnavigation() {
        FloatingActionButton floatingActionButton = findViewById(R.id.card_btn);
        LinearLayout homeBtn = findViewById(R.id.homeBtn);
        LinearLayout accountbtn = findViewById(R.id.btn_account);
        LinearLayout settingbtn = findViewById(R.id.btn_setting);
        LinearLayout smsbtn = findViewById(R.id.btn_sms);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CartListActivity.class));
            }
        });
        accountbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Account.class));
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });

    }

    private void recyclerViewPopular() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularList = findViewById(R.id.recyclerView2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);
        ArrayList<FoodDomain>  foodlist =  new ArrayList<>();
        foodlist.add(new FoodDomain("Cafe tr???ng","cafe8","Lorem Ipsum is simply dummy text of the printing and typesetting industry",30.000 ));
        foodlist.add(new FoodDomain("Tr?? s???a","cafe2","Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",28.000));
        foodlist.add(new FoodDomain("Cafe","cafe7","Lorem Ipsum dummy text ever since the 1500s",25.000));
        adapter2 = new PopularAdapter(foodlist);
        recyclerViewPopularList.setAdapter(adapter2);
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList = findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);
        ArrayList<CategoryDomain>  categorylist =  new ArrayList<>();
        categorylist.add(new CategoryDomain("Pizza","cat_1"));
        categorylist.add(new CategoryDomain("Burgez","cat_2"));
        categorylist.add(new CategoryDomain("HotDog","cat_3"));
        categorylist.add(new CategoryDomain("Drink","cat_4"));
        categorylist.add(new CategoryDomain("Donot","cat_5"));
        adapter = new CategoryAdapter(categorylist);
        recyclerViewCategoryList.setAdapter(adapter);
    }
    private void AnhXa() {
        accountimg = findViewById(R.id.imageView3);
        lvNoiDung = (ListView) findViewById(R.id.listviewnoidung);
        arrayNoiDung=new ArrayList<>();
        arrayNoiDung.add(new NoiDung("Tin t???c","TH?????NG TH???C CAFE RANG XAY & T??I L???C  C???A FAST","Fast lu??n c??? g???ng kh??ng ng???ng ????? cho ra s???n ph???m ph?? h???p v???i nh???p s???ng hi???n ?????i",R.drawable.imgtt1));
        arrayNoiDung.add(new NoiDung(" ","TH?????NG TH???C KEM GELATO NGON CHU???N ?? T???I FAST CH??? V???I 30.000??","Fast lu??n c??? g???ng kh??ng ng???ng ????? cho ra s???n ph???m ph?? h???p v???i nh???p s???ng hi???n ?????i",R.drawable.imgtt2));
        arrayNoiDung.add(new NoiDung("","??U ????I 50% T???T NAY TH??M R???N R??NG","Fast lu??n c??? g???ng kh??ng ng???ng ????? cho ra s???n ph???m ph?? h???p v???i nh???p s???ng hi???n ?????i",R.drawable.imgtt3));
        arrayNoiDung.add(new NoiDung("","T???T SUNG T??C CH???M V??? XU??N","",R.drawable.imgtt4));
        arrayNoiDung.add(new NoiDung("","FAST COFFEE - 30 TR???N DO???N,QU???N 20 XIN CH??O","",R.drawable.imgtt5));
        arrayNoiDung.add(new NoiDung("","NH??N ????I NI???M VUI GI??NG SINH- T???NG 40% LY TH??? 2","Fast lu??n c??? g???ng kh??ng ng???ng ????? cho ra s???n ph???m ph?? h???p v???i nh???p s???ng hi???n ?????i",R.drawable.imgtt6));

    }
}