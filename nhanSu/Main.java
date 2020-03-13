package nhanSu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinhVien a = new SinhVien();
        System.out.println("Sinh Viên" );
        Scanner sinhVien = new Scanner(System.in);
        System.out.println("Nhập Tên Của Sinh Viên : ");
        String hoVaTen = sinhVien.nextLine();
        System.out.println("Lớp Sinh Viên Học : ");
        int lop = sinhVien.nextInt();
        System.out.println("Nhập Điểm Môn Toán Của Sinh Viên : ");
        int diemToan = sinhVien.nextInt();
        System.out.println("Nhập Điểm Môn Lý Của Sinh Viên : ");
        int diemLy = sinhVien.nextInt();
        System.out.println("Nhập Điểm Môn Hóa Của Sinh Viên : ");
        int diemHoa = sinhVien.nextInt();

        a.diemTrungBinhCong(diemToan,diemLy,diemHoa);
        System.out.println("Điểm Trung Bình Cộng là  : " + a.diemTrungBinhCong(diemToan,diemLy,diemHoa));
        System.out.println("B Có Dậy 3 Môn Toán,Lý,Hóa");

        int diemTong3Mon = 10;
        System.out.println("Sếp loại Học Lực : ");
        if(diemTong3Mon < 5){
            System.out.println("Học Ngu: Học Sinh Trung Bình:))");
        }else if (diemTong3Mon <= 7){
            System.out.println("Cố Gắng Thêm Nhé,Học Sinh Loại Khá : ");
        }else if(diemTong3Mon <=10){
            System.out.println("Chúc Mừng Bạn ,Học Sinh Loại Xuất Sắc");
        }


















        GiangVien b = new GiangVien();


    }
}
