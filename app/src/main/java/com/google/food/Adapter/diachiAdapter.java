package com.google.food.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.google.food.Domain.DiaChi;
import com.google.food.R;

import java.util.List;

public class diachiAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<DiaChi> diaChiList;

    public diachiAdapter(Context context, int layout, List<DiaChi> diaChiList) {
        this.context = context;
        this.layout = layout;
        this.diaChiList = diaChiList;
    }

    @Override
    public int getCount() {
        return diaChiList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class ViewHolder{
        TextView txtdiaDiem, txtdiaChi, txtName, txtSDT;

    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder.txtdiaDiem   = (TextView) view.findViewById(R.id.textviewDiaDiem);
            holder.txtdiaChi    = (TextView) view.findViewById(R.id.textviewDiaChi);
            holder.txtName      = (TextView) view.findViewById(R.id.textViewTen);
            holder.txtSDT       = (TextView) view.findViewById(R.id.textviewSDT);

            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        DiaChi diachi = diaChiList.get(i);
        holder.txtdiaDiem.setText(diachi.getLocation());
        holder.txtdiaChi.setText(diachi.getAddress());
        holder.txtName.setText(diachi.getName());
        holder.txtSDT.setText(diachi.getPhone_number());
        return null;
    }
}
