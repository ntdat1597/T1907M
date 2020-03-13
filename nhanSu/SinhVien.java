package nhanSu;

import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private int lop;
    private int diemToan;
    private int diemLy;
    private int diemHoa;

    public SinhVien(String hoTen, int lop, int diemToan, int diemLy, int diemHoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public SinhVien() {

    }


    public int getDiemTrungBinh() {
        int diemTong3Mon = 30;
        System.out.println("Sếp loại Học Lực : " + diemTong3Mon);
        if(diemTong3Mon < 5){
            System.out.println("Học Ngu: Học Sinh Trung Bình:))");
        }else if (diemTong3Mon >= 7){
            System.out.println("Cố Gắng Thêm Nhé,Học Sinh Loại Khá : ");
        }else if(diemTong3Mon >=8){
            System.out.println("Chúc Mừng Bạn ,Học Sinh Loại Xuất Sắc");
        }

        return diemTong3Mon;


    }

    public int diemTrungBinhCong(int diemToan,int diemLy,int diemHoa) {
        int diemTrungBinhCong = diemToan + diemLy + diemHoa / 3;
        return diemTrungBinhCong;
    }

//    public void nhapThongTinSinhVien() {
//        Scanner sinhVien = new Scanner(System.in);
//        System.out.println("Nhập Tên Của Sinh Viên : ");
//        String hoVaTen = sinhVien.nextLine();
//        System.out.println("Lớp Sinh Viên Học : ");
//        int lop = sinhVien.nextInt();
//        System.out.println("Nhập Điểm Môn Toán Của Sinh Viên : ");
//        int diemToan = sinhVien.nextInt();
//        System.out.println("Nhập Điểm Môn Lý Của Sinh Viên : ");
//        int diemLy = sinhVien.nextInt();
//        System.out.println("Nhập Điểm Môn Hóa Của Sinh Viên : ");
//        int diemHoa = sinhVien.nextInt();
//    }

    public void inThongTinSinhVien() {
        System.out.println("Họ Và Tên : " + hoTen);
        System.out.println("Học Lớp Nào : " + lop);
        System.out.println("Điểm Toán " + diemToan);
        System.out.println("Điển Lý  : " + diemLy);
        System.out.println("Điểm Hóa : " + diemHoa);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public int getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(int diemToan) {
        this.diemToan = diemToan;
    }

    public int getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(int diemLy) {
        this.diemLy = diemLy;
    }

    public int getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(int diemHoa) {
        this.diemHoa = diemHoa;
    }
}
