package com.google.food.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.food.Domain.NoiDung;
import com.google.food.R;

import java.util.List;

public class NoiDungAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<NoiDung> noiDungList;

    public NoiDungAdapter(Context context, int layout, List<NoiDung> noiDungList) {
        this.context = context;
        this.layout = layout;
        this.noiDungList = noiDungList;
    }

    @Override
    public int getCount() {
        return noiDungList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view =inflater.inflate(layout,null);
        TextView txtTieuDe=(TextView) view.findViewById(R.id.textViewtieude);
        TextView txtTen=(TextView) view.findViewById(R.id.textViewTen);
        TextView txtMota=(TextView) view.findViewById(R.id.textViewMota);
        ImageView imgHinh=(ImageView) view.findViewById(R.id.imagehinh);
        NoiDung noiDung= noiDungList.get(i);
        txtTieuDe.setText(noiDung.getTieuDe());
        txtTen.setText(noiDung.getTen());
        txtMota.setText(noiDung.getMoTa());
        imgHinh.setImageResource(noiDung.getHinh());
        return view;
    }
}
