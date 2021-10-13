package khoa1Chuong4;

import java.util.Scanner;

public class TimSoLonNhat {
    public static int timSoLonNhat(int a, int b, int c){
        int soLonNhat = a;
        if (b> soLonNhat){
            soLonNhat = b;
        }
        if (c> soLonNhat){
            soLonNhat = c;
        }
        return soLonNhat;
    }




    public static void main(String[] args){
       System.out.println("Chương trình tìm số lớn nhất");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số thứ nhất ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vào số thứ hai ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vào số thứ ba ");
        int c = Integer.parseInt(sc.nextLine());

        int soLonNhat = timSoLonNhat(a, b, c);
        System.out.print("Số lớn nhất trong ba số là "+ soLonNhat);

    }
}
