package kiemtra;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LaiSuatNganHang {
    private double balance;
    private double rate;

    public LaiSuatNganHang(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double calculateInterest() {
        double interest = balance * (rate / 1200);
        return interest;
    }

    public static void main(String[] args) {
        LaiSuatNganHang LaiSuatNganHang = new LaiSuatNganHang(1000, 10);
        System.out.println(LaiSuatNganHang.calculateInterest());
    }
}