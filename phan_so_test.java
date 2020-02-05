package bai_tap_phan_so;

import bai_tap_phan_so.PS;
import bai_tap_phan_so.Rational;

import java.util.Scanner;

public class phan_so_test {

    public static void main(String[] ahedh) {
        //tao doi tuong kieu phan so de truyen gia tri tu,mau
        Scanner ps = new Scanner(System.in);

        Rational a = new Rational(1, 9);
        Rational b = new Rational(2, 4);

        Rational kq = new Rational();

        PS p2 = new PS();
        kq = p2.cong(a, b);
        p2.setPhanso(kq);
        p2.setUcln();
        p2.rutgon();
        System.out.println(kq.getTu() + "/" + kq.getMau());
    }
}