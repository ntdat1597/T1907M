package phanSo;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo() {

    }

    public void inRaPhanSo() {
        System.out.println(getTuSo() + "/" + getMauSo());
    }

    public int timUCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void nhapPhanso() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tử số: ");
        tuSo = sc.nextInt();
        System.out.println("Nhập vào mẫu số ");
        mauSo = sc.nextInt();
    }

    public void rutGonPhanSo() {
        int i = timUCLN(getTuSo(), this.getMauSo());
        this.setTuSo(getTuSo() / i);
        this.setMauSo(getMauSo() / i);

    }

    public PhanSo congPhanSo(PhanSo ps1, PhanSo ps2) {
        PhanSo ketQua = new PhanSo();
        //cùng mẫu
        if (ps1.getMauSo() == ps2.getMauSo()) {
            ketQua.setTuSo(ps1.getTuSo() + ps2.getTuSo());
            ketQua.setMauSo(ps1.getMauSo());
            //Khác mẫu
        } else {
            //1. ps1 * mãu cua ps2 - xong b1
            //2. ps2 * mẫu ps1
            //3. + vào nhauu
            PhanSo quyDongPs1 = new PhanSo();
            quyDongPs1.setTuSo(ps1.getTuSo() * ps2.getMauSo());
            quyDongPs1.setMauSo(ps1.getMauSo() * ps2.getMauSo());

            PhanSo quyDongPs2 = new PhanSo();
            quyDongPs2.setTuSo(ps2.getTuSo() * ps1.getMauSo());
            quyDongPs2.setMauSo(ps2.getMauSo() * ps1.getMauSo());

            ketQua.setTuSo(quyDongPs1.getTuSo() + quyDongPs2.getTuSo());
            ketQua.setMauSo(quyDongPs1.getMauSo());

        }
        return ketQua;
    }

    public PhanSo truPhanSo(PhanSo ps1, PhanSo ps2) {
        PhanSo ketqua = new PhanSo();

        if (ps1.getMauSo() == ps2.getMauSo()) { // cùng mẫu
            ketqua.setTuSo(ps1.getTuSo() - ps2.getTuSo());
            ketqua.setMauSo(ps2.getMauSo());
        } else {// khác mẫu
            PhanSo quyDongPs1 = new PhanSo();
            quyDongPs1.setTuSo(ps1.getTuSo() * ps2.getMauSo());
            quyDongPs1.setMauSo(ps1.getMauSo() * ps2.getMauSo());

            PhanSo quyDongPs2 = new PhanSo();
            quyDongPs2.setTuSo(ps2.getTuSo() * ps1.getMauSo());
            quyDongPs2.setMauSo(ps2.getMauSo() * ps2.getMauSo());

            ketqua.setTuSo(quyDongPs1.getTuSo() - quyDongPs2.getTuSo());
            ketqua.setMauSo(quyDongPs1.getMauSo());

        }
        return ketqua;
    }

    public PhanSo nhanPhanSo(PhanSo ps1, PhanSo ps2) {
        PhanSo ketqua = new PhanSo();

        ketqua.setTuSo(ps1.getTuSo() * ps2.getTuSo());
        ketqua.setMauSo(ps1.getMauSo() * ps2.getMauSo());
        ketqua.rutGonPhanSo();

        return ketqua;
    }

    public PhanSo chiaPhanSo(PhanSo ps1, PhanSo ps2) {
        PhanSo ketqua = new PhanSo();

        ketqua.setTuSo(ps1.getTuSo() * ps2.getMauSo());
        ketqua.setMauSo(ps1.getMauSo() * ps2.getTuSo());
        ketqua.rutGonPhanSo();


        return ketqua;


    }


    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
}



