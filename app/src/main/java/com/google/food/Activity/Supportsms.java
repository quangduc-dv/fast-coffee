package com.google.food.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.food.Fragment.ViewPagerFragmentAdaptar;
import com.google.food.R;

public class Supportsms extends AppCompatActivity {
    ViewPagerFragmentAdaptar viewPagerFragmentAdaptar;
    TabLayout tabLayout;
    ViewPager2 viewPager2;
    private String[] titles= new String[]{"Khuyến mãi","Chưa đọc","Giao dịch"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supportsms);
        viewPager2 = findViewById(R.id.view_page);
        tabLayout = findViewById(R.id.tab_layout);
        viewPagerFragmentAdaptar = new ViewPagerFragmentAdaptar(this);
        viewPager2.setAdapter(viewPagerFragmentAdaptar);
        new TabLayoutMediator(tabLayout,viewPager2,((tab, position) -> tab.setText(titles[position]))).attach();
    }
}