package DemoHomNayAnGi;

public class MonAn {
    String ten_monan;
    int so_luong;
    int gia_tien;
    int tong_tien;

    public MonAn() {
    }

    public MonAn(String ten_monan, int so_luong, int gia_tien) {
        this.ten_monan = ten_monan;
        this.so_luong = so_luong;
        this.gia_tien = gia_tien;
    }

    public MonAn(String ten_monan, int so_luong, int gia_tien, int tong_tien) {
        this.ten_monan = ten_monan;
        this.so_luong = so_luong;
        this.gia_tien = gia_tien;
        this.tong_tien = tong_tien;
    }

    public int getGia_tien() {
        return gia_tien;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public String getTen_monan() {
        return ten_monan;
    }

    public int getTong_tien() {
        return tong_tien;
    }

    public void setGia_tien(int gia_tien) {
        this.gia_tien = gia_tien;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public void setTen_monan(String ten_monan) {
        this.ten_monan = ten_monan;
    }

    public void setTong_tien(int tong_tien) {
        this.tong_tien = tong_tien;
    }

    public void thong_tin_mon() {
        this.tong_tien = this.so_luong * this.gia_tien;
        String info = "Ten mon an: " + this.ten_monan + " | So luong: " + this.so_luong + " | Gia tien: " + this.gia_tien + " | Tong tien: " + this.tong_tien;
        System.out.println(info);
    }}
