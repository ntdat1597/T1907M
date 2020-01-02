package baiTapTrenLop;

import java.util.Scanner;

public class nhapDiem {
    public static void main(String[] args) {
        int d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số sinh viên : ");
        int diem = scanner.nextInt();
        int[] diem1 = new int[diem];

        for (d = 0; d <= diem; d++) {
            diem1[d] = scanner.nextInt();
            System.out.println("nhập số điểm của sinh viên vào đây :" );
            if (d <= 40) {
                System.out.println(" điểm của bạn không đủ để qua môn :");
            } else if  (d >= 75) {

                System.out.println("điểm của bạn đạt loại khá ");
            }
                }
                if(d >=100){
                    System.out.println("điểm của bạn đạt loại giỏi");
                }
            }
        }


