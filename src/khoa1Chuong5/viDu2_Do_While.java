package khoa1Chuong5;

import java.util.Scanner;

public class viDu2_Do_While {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        doanSo(sc);
    }
    public static void doanSo(Scanner sc){
        int soBiMat = (int) (Math.random() * 99 + 1);
        int nhap;
        do {
            System.out.println("Vui lòng nhập vào 1 số từ 1-99 ");
            nhap = Integer.parseInt(sc.nextLine());
            if (nhap > soBiMat){
                System.out.println("Vui lòng nhập số nhỏ hơn");
            }
            if (nhap < soBiMat){
                System.out.println("Vui lòng nhập số lớn hơn");
            }
        } while (nhap != soBiMat);
        System.out.println("Chúc mừng chiến thắng!!!");
    }
}
