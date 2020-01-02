package baiTapTrenLop;

import java.util.Scanner;

public class nhapMotMang {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int[] myIntergers = initArray(5);
        // in ra các giá trị trong intergers
        for (int i = 0; i < myIntergers.length; i++) {
            System.out.println("Element" + i + "typed values was" + myIntergers[i]);

        }
        // gọi hàm tính giá trị trung bình
        System.out.println("Average is" + getAvgrage(myIntergers) );
    }

    private static int[] initArray(int i) {
        return new int[0];
    }


    // khởi tại mảng
    // size kich cỡ của mảng
    // @return mang giá trị
    public static int[] intsArray(int size) {
        int[] values = new int[size];
        System.out.println("Enter" + size + " intterger values.");

        for (int i = 0; 1 < size; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    //** tính giá trị trung bình
    //@param array mang can tinh gia tri
    //@return gia tri của mảng

    public static double getAvgrage(int[] array) {
        double avg = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double ) sum / (double)array.length;

    }
}
