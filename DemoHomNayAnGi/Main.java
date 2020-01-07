package DemoHomNayAnGi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choose;
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n");
            System.out.println("***Hom nay an gi***");
            System.out.println("1. Xem Menu");
            System.out.println("2. Them mon");
            System.out.println("3. Xoa mon");
            System.out.println("0. Ket thuc dat hang");
            System.out.println("---");
            System.out.print("Chon: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    menu.danh_sach_menu();
                    break;
                case 2:
                    menu.kiem_tra_menu();
                    break;
                case 3:
                    menu.xoa_mon_an();
                    break;
                case 0:
                    System.out.println("Ket thuc dat hang.");
                    break;
                default:
                    System.out.println("Lam gi co chuc nang day ma chon.");
            }
        } while (choose != 0);
    }
}
