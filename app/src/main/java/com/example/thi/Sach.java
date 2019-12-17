package com.example.thi;

public class Sach {
    private String SKU;
    private String tacGia;
    private String ngayXuatBan;
    private String soTrang;
    private String gia;
    private String gioiThieuSach;

    public Sach() {
    }

    public Sach(String SKU, String tacGia, String ngayXuatBan, String soTrang, String gia, String gioiThieuSach) {
        this.SKU = SKU;
        this.tacGia = tacGia;
        this.ngayXuatBan = ngayXuatBan;
        this.soTrang = soTrang;
        this.gia = gia;
        this.gioiThieuSach = gioiThieuSach;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNgayXuatBan() {
        return ngayXuatBan;
    }

    public void setNgayXuatBan(String ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }

    public String getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(String soTrang) {
        this.soTrang = soTrang;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getGioiThieuSach() {
        return gioiThieuSach;
    }

    public void setGioiThieuSach(String gioiThieuSach) {
        this.gioiThieuSach = gioiThieuSach;
    }

    @Override
    public String toString() {
        return  SKU + "  |  " + gioiThieuSach;

    }
}
