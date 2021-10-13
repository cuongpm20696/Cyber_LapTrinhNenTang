package khoa1Chuong2;

import java.util.Scanner;

public class Nhap {
    public static void main(String[] args){
        System.out.println("Demo lệnh nhập");
        Scanner scan = new Scanner(System.in);
        System.out.println("Vui lòng nhập vào 1 chuỗi");
        String chuoi = scan.nextLine();
        System.out.println("Chuỗi bạn vừa nhập là: " + chuoi);
    }
}
