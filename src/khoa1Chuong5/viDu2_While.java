package khoa1Chuong5;

import java.util.Scanner;

public class viDu2_While {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float tong = tinhTongKhongAmCach2(sc);
    System.out.println("Tổng các số đã nhập là "+ tong);
    }
    public static float tinhTongKhongAmCach1(Scanner sc){
        float tong = 0;
        int nhap = 1;
        while (nhap > 0){
            System.out.println("Nhập vào số lớn hơn 0. Nhập vào số nhỏ hơn 0 để dừng");
            nhap = Integer.parseInt(sc.nextLine());
            if (nhap > 0){
                tong += nhap;
            }
        }
        return tong;
    }
    public static float tinhTongKhongAmCach2(Scanner sc){
        float tong = 0;
        boolean flag = true;
        while (flag){
            System.out.println("Nhập vào số lớn hơn 0. Nhập vào số nhỏ hơn 0 để dừng");
            int nhap = Integer.parseInt(sc.nextLine());
            if (nhap > 0){
                tong += nhap;
            } else {
                flag = false;
            }
        }
        return tong;
    }
}
