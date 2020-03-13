package nhanSu;

import java.util.Scanner;

public class GiangVien {
    private String hoTen;
    private int daylop;
    private int namSinh;
    private int luong;

    public GiangVien(String hoTen, int daylop, int namSinh, int luong) {
        this.hoTen = hoTen;
        this.daylop = daylop;
        this.namSinh = namSinh;
        this.luong = luong;
    }

    public GiangVien() {

    }


    public void inThongTinGiangVien(){
        System.out.println("Họ Và Tên : " + hoTen);
        System.out.println("Dậy lớp nào : " +daylop);
        System.out.println("Năm Sinh : " + namSinh);
        System.out.println("Lương : " +luong);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getDaylop() {
        return daylop;
    }

    public void setDaylop(int daylop) {
        this.daylop = daylop;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
}

