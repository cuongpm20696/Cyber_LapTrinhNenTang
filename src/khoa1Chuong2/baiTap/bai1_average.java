package khoa1Chuong2.baiTap;

import java.util.Scanner;

public class bai1_average {
    public static void main(String[] args){
        /*   b1: tạo biến n, sum, average, SO_GIA_TRI
         *   b2: nhập số nguyên dương
         *   b3: tính tổng các số sum += n
         *   b4: tính trung bình cộng average = sum/SO_GIA_TRI
         */

        final int SO_GIA_TRI = 5;
        int n;
        int sum = 0;
        float average;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên thứ nhất: ");
        n = Integer.parseInt(sc.nextLine());
        sum += n;
        System.out.print("Nhập vào số nguyên thứ hai: ");
        n = Integer.parseInt(sc.nextLine());
        sum += n;
        System.out.print("Nhập vào số nguyên thứ ba: ");
        n = Integer.parseInt(sc.nextLine());
        sum += n;
        System.out.print("Nhập vào số nguyên thứ tư: ");
        n = Integer.parseInt(sc.nextLine());
        sum += n;
        System.out.print("Nhập vào số nguyên thứ năm: ");
        n = Integer.parseInt(sc.nextLine());
        sum += n;

        average = (1.0f)*sum/SO_GIA_TRI;
        System.out.println("Trung bình cộng 5 số là: " + average);


    }




}
