package khoa1Chuong2.baiTap;

import java.util.Scanner;

public class bai2_VND_USD {
    public static void main(String[] args){
        /*
        * b1: tạo hằng số tỷ giá VND_USD = 23500, tạo biến usd, vnd
        * b2: nhập vào số usd cần đổi
        * b3: vnd = usd * VND_USD
        * b4: in ra kết quả
        */

        final int VND_USD = 23500;
        int usd, vnd;

        Scanner sc = new Scanner(System.in);
        System.out.println("Tỷ giá 1 USD = "+ VND_USD + "đ");
        System.out.print("Nhập vào số USD cần đổi: ");
        usd = Integer.parseInt(sc.nextLine());
        vnd = usd * VND_USD;
        System.out.println(usd + " USD = " + vnd + "đ");

    }
}
