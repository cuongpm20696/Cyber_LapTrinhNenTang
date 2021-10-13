package khoa1Chuong5;

import java.util.Scanner;

public class viDu2_For {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số n ");
        int n = Integer.parseInt(sc.nextLine());
        int tong = tinhTongWhile(n);
        System.out.println("Tổng của các số chẵn từ 1 đến "+ n + " là " + tong);

    }
    public static int tinhTongFor(int n){
        int tong = 0;
        for (int i = 0; i<=n; i+=2){
            tong += i;
        }
        return tong;

    }
    public static int tinhTongWhile(int n){
        int tong = 0;
        int i = 0;
        while (i <= n){
            tong += i;
            i += 2;
        }
        return tong;
    }
}
