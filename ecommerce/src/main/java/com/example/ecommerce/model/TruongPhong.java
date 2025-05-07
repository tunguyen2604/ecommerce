package com.example.ecommerce.model;

public class TruongPhong extends NhanVien{
    private double phuCap;
    private int soNamDuongChuc;

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public int getSoNamDuongChuc() {
        return soNamDuongChuc;
    }

    public void setSoNamDuongChuc(int soNamDuongChuc) {
        this.soNamDuongChuc = soNamDuongChuc;
    }

    public TruongPhong(String tenNhanVien, double heSoLuong, double phuCap, int soNamDuongChuc) {
        super(tenNhanVien, heSoLuong);
        this.phuCap=phuCap;
        this.soNamDuongChuc=soNamDuongChuc;
    }

    public TruongPhong() {
        super();
        this.phuCap=0;
        this.soNamDuongChuc=0;
    }
}
