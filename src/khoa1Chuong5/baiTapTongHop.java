package khoa1Chuong5;

import java.util.Scanner;

public class baiTapTongHop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số n ");
        int n = Integer.parseInt(sc.nextLine());
        xuLySo(n);
    }

    public static void xuLySo(int n){
        int soBanDau = n; // tạo bản sao của n để xử lý
        int soDangTach; // tách dần theo thứ tự hàng đơn vị trở về trước
        int tongCacSo = 0;
        int dem = 0;
        do {
            soDangTach = soBanDau % 10;
            dem++;
            tongCacSo += soDangTach;
            soBanDau /= 10;
        } while (soBanDau != 0);

        System.out.println("Số " + n + " có " + dem + " chữ số");
        System.out.println("Chữ số cuối cùng là " + n%10);
        System.out.println("Chữ số hàng đầu tiên là " + soDangTach);
        System.out.println("Tổng các chữ số là " + tongCacSo);

        // đảo ngược số n
        System.out.print("Số đảo ngược của n = " + n + " là ");
        // loại bỏ các số 0
        while (n % 10 == 0){
            n /= 10;
        }
        do {
            System.out.print("" + n % 10);
            n /= 10;
        } while (n != 0);

    }
}
