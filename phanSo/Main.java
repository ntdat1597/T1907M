package phanSo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PhanSo phanSo1 = new PhanSo();
        PhanSo phanSo2 = new PhanSo();
        PhanSo ketQua = new PhanSo();

        System.out.println("Nhập phân số 1 : ");
        phanSo1.nhapPhanso();
        System.out.println("Nhập Phấn Số 2 :");
        phanSo2.nhapPhanso();
        System.out.println("Phân Số 1 :");
        phanSo1.inRaPhanSo();
        System.out.println("Phấn số 2 : ");
        phanSo2.inRaPhanSo();

        PhanSo congPs = ketQua.congPhanSo(phanSo1,phanSo2);
        congPs.inRaPhanSo();
        PhanSo truPs = ketQua.truPhanSo(phanSo1,phanSo2);
        truPs.inRaPhanSo();
        PhanSo nhanPs = ketQua.nhanPhanSo(phanSo1,phanSo2);
        nhanPs.inRaPhanSo();
        PhanSo chiaPs = ketQua.chiaPhanSo(phanSo1,phanSo2);
        chiaPs.inRaPhanSo();






    }

}