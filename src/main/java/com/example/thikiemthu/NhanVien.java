package com.example.thikiemthu;

public class NhanVien {

    String ten;

    String ma;

    int tuoi;

    float luong;

    int soNamLamViec;

    String phongBan;


    public NhanVien(String ten, String ma, int tuoi, float luong, int soNamLamViec, String phongBan) {
        setTen(ten);
        setMa(ma);
        this.tuoi = tuoi;
        setLuong(luong);
        this.soNamLamViec = soNamLamViec;
        setPhongBan(phongBan);
    }

    public NhanVien() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {

        if (ten == null || ten.equals("")) {
            throw new IllegalArgumentException("tên không đc null");
        }

        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {

        if (ma == null || ma.equals("")) {
            throw new IllegalArgumentException("mã không đc null");
        }

        this.ma = ma;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public int getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(int soNamLamViec) {
        this.soNamLamViec = soNamLamViec;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        if (phongBan == null || phongBan.equals("")) {
            throw new IllegalArgumentException("phong ban không đc null");
        }
        this.phongBan = phongBan;

    }
}
