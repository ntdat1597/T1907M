package movielist;

import java.util.Scanner;

public class Contact<opt> {
    private int id;
    private String ten;
    private Object diaChi;
    private int sdt;

    /**
     * contactlist
     */

    public class contact {
        int id;
        String ten;
        int sdt;
        String diachi;
    }

    public void contact(int id, int sdt, String ten, String diachi) {
        this.id = id;
        this.ten = ten;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public void hienThi() {

        System.out.println("-------------------");
        System.out.println("Ma nhan vien: " + id);
        System.out.println("Ten nhan vien: " + ten);
        System.out.println("Dia Chi: " + diaChi);
        System.out.println("So dien thoai: " + sdt);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        int opt;
        Scanner s = new Scanner(System.in);
        System.out.println("MENU:");
        System.out.println("2. Sua dia chi");
        System.out.println("6. Sua so dien thoai");
        System.out.println("7. Sua email");
        System.out.print("Lua chon de update: ");
        opt = s.nextInt();
    }


         {

                System.out.print("Nhap ten moi: ");
                Scanner s = null;
                ten = s.nextLine();


                System.out.print("Nhap dia chi moi");
                diaChi = s.nextLine();


                System.out.print("Nhap so dien thoai moi: ");
                sdt = s.nextInt();


        }

    }


