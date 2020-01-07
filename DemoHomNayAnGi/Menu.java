package DemoHomNayAnGi;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<MonAn> arl = new ArrayList<>();
    MonAn monan = new MonAn();

    public void danh_sach_menu() {
        for (int i = 0; i < arl.size(); i++) {
            monan = arl.get(i);
            monan.thong_tin_mon();
        }
    }

    public void kiem_tra_menu() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("- Moi nhap ten mon: ");
        String ten_mon = scanner.nextLine();
        for (int i = 0; i < arl.size(); i++) {
            monan = arl.get(i);
            if (monan.getTen_monan().equals(ten_mon)) {
                this.them_so_luong(ten_mon);
                count++;
            }
        }
        if (count == 0) {
            this.them_mon(ten_mon);
            System.out.println("2");
        }
    }

    public void them_mon(String ten_mon) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("- Moi nhap so luong dat: ");
        int so_luong = scanner.nextInt();
        System.out.println("- Moi nhap gia tien: ");
        int gia_tien = scanner.nextInt();

        monan = new MonAn(ten_mon, so_luong, gia_tien);
        arl.add(monan);
    }

    public void them_so_luong(String ten_mon) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arl.size(); i++) {
            monan = arl.get(i);
            if (monan.getTen_monan().equals(ten_mon)) {
                System.out.println("Moi nhap so luong dat: ");
                int so_luong_moi = scanner.nextInt();
                monan.setSo_luong(monan.getSo_luong() + so_luong_moi);
                arl.set(i, monan);
            }
        }
    }

    public void xoa_mon_an() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("- Nhap ten mon an: ");
        String ten_mon = scanner.nextLine();
        for (int i = 0; i < arl.size(); i++) {
            monan = arl.get(i);
            if (monan.getTen_monan().equals(ten_mon)) {
                arl.remove(i);
                System.out.println("Da xoa " + ten_mon + " trong menu.");
            } else {
                System.out.println("Khong tim thay mon " + ten_mon + " trong thuc don.");
            }
        }
    }
}
