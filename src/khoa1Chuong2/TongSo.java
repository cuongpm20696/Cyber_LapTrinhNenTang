package khoa1Chuong2;

import java.util.Scanner;

public class TongSo {
    public static void main(String[] args){
        int n, unit, ten, hundred, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");

        n = Integer.parseInt(sc.nextLine());
        hundred = n/100;
        ten = n%100/10;
        unit = n%10;
        sum = hundred + ten + unit;
        System.out.println("Tổng của 3 chữ số của n " + n + " là " + sum);
    }
}
