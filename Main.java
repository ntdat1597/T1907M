package atm;


import quanLy.NhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
//tạo 1 list số nguyên tố, xem có phải là số nguyên tố hay ko.



    public static void main(String[] args) {
        int snt = 2;
        List<Integer> listSoNguyenTo = new ArrayList<>();
        listSoNguyenTo.add(1);
        listSoNguyenTo.add(2);
        listSoNguyenTo.add(3);
        listSoNguyenTo.add(4);
        listSoNguyenTo.add(5);
        listSoNguyenTo.add(6);
        listSoNguyenTo.add(7);
        listSoNguyenTo.add(8);
        listSoNguyenTo.add(9);
        listSoNguyenTo.add(10);


        for (Integer soNguyenTo : listSoNguyenTo){
            if (soNguyenTo < 2){
                System.out.println(soNguyenTo + " Không phải là số nguyên tố ");
            }else {
                    if (soNguyenTo %2==1){
                        System.out.println(soNguyenTo + " Là số nguyên tố");
                    }

            }

        }


    }
}
