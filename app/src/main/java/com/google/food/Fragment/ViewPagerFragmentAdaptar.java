package com.google.food.Fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerFragmentAdaptar extends FragmentStateAdapter {
    private String[] titles= new String[]{"Quan Tâm","Chưa đọc","Giao dịch"};
    public ViewPagerFragmentAdaptar(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0: return new QuanTamFragment();
            case 1: return new ChuaDocFragment();
            case 2: return new GiaodichFragment();

        }
        return new QuanTamFragment();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
