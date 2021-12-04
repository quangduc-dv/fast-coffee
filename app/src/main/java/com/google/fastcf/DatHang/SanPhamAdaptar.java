package com.google.fastcf.DatHang;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.fastcf.DatHang.SanPham;
import com.google.fastcf.R;

import java.util.List;

public class SanPhamAdaptar extends BaseAdapter {
    private BottomSheetDialog bottomSheetDialog;
    private Context context;
    private int layout;
    private List<SanPham> sanPhamList;

    public SanPhamAdaptar(Context context, int layout, List<SanPham> sanPhamList) {
        this.context = context;
        this.layout = layout;
        this.sanPhamList = sanPhamList;
    }

    @Override
    public int getCount() {
        return sanPhamList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class Viewholder{
        ImageView imgHinh;
        TextView txtTen,txtGia;
        TextView txtDVT;

    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Viewholder holdel;
        if (view == null){
            holdel = new Viewholder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view= inflater.inflate(layout,null);
            holdel.imgHinh= (ImageView) view.findViewById(R.id.imageviewsanpham);
            holdel.txtTen=(TextView) view.findViewById(R.id.textviewtensp);
            holdel.txtGia=(TextView) view.findViewById(R.id.textviewgiasp);
            holdel.txtDVT=(TextView) view.findViewById(R.id.textviewdvtt);
            view.setTag(holdel);
        }else {
            holdel = (Viewholder) view.getTag();
        }
        SanPham sanPham = sanPhamList.get(i);
        holdel.imgHinh.setImageResource(sanPham.getHinh());
        holdel.txtTen.setText(sanPham.getTen());
        holdel.txtGia.setText(sanPham.getGia());
        holdel.txtDVT.setText(sanPham.getDonViTien());

        //
        holdel.imgHinh.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                bottomSheetDialog = new BottomSheetDialog(context,R.style.BottomSheetTheme);
                View sheetView = LayoutInflater.from(context).inflate(R.layout.bottom_sheet,null);
                sheetView.findViewById(R.id.add_to_cart).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context,"Added to a Cart",Toast.LENGTH_SHORT).show();
                        bottomSheetDialog.dismiss();
                    }
                });
                ImageView bottomImg = sheetView.findViewById(R.id.bottom_img);
                TextView bottomName = sheetView.findViewById(R.id.bottom_name);
                TextView bottomPrice = sheetView.findViewById(R.id.bottom_price);
                TextView bottomTiming = sheetView.findViewById(R.id.bottom_timing);
                TextView bottomRating = sheetView.findViewById(R.id.bottom_rating);
                bottomName.setText(R.id.bottom_name);
                bottomPrice.setText(R.id.bottom_price);
                bottomTiming.setText(R.id.bottom_timing);
                bottomRating.setText(R.id.bottom_rating);
                bottomImg.setImageResource(R.id.bottom_img);
                bottomSheetDialog.setContentView(sheetView);
                bottomSheetDialog.show();
            }
        });
        return view;
    }
}
