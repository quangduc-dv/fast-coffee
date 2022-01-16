package com.google.food.Domain;

public class NoiDung {
    private String TieuDe;
    private String Ten;
    private String MoTa;
    private int Hinh;

    public NoiDung(String tieuDe, String ten, String moTa, int hinh) {
        TieuDe = tieuDe;
        Ten = ten;
        MoTa = moTa;
        Hinh = hinh;
    }

    public String getTieuDe() {
        return TieuDe;
    }

    public void setTieuDe(String tieuDe) {
        TieuDe = tieuDe;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
