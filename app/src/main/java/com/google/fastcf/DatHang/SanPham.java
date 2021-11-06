package com.google.fastcf.DatHang;

public class SanPham {
    private  String Ten;
    private  String Gia;
    private  String DonViTien;
    private  int Hinh;

    public SanPham(String ten, String gia, String donViTien, int hinh) {
        Ten = ten;
        Gia = gia;
        DonViTien = donViTien;
        Hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String gia) {
        Gia = gia;
    }

    public String getDonViTien() {
        return DonViTien;
    }

    public void setDonViTien(String donViTien) {
        DonViTien = donViTien;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
