package khoa1Chuong5;

import java.util.Scanner;

public class viDu1_Do_While {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        float a = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập số b: ");
        float b = Float.parseFloat(sc.nextLine());
        xuLyMenu(sc, a, b);
    }

    public static void inMenu(){
        System.out.println("Mời chọn theo các chức năng:");
        System.out.println("1. Tính tổng");
        System.out.println("2. Tính hiệu");
        System.out.println("3. Tính tích");
        System.out.println("4. Tính thương");
        System.out.println("0. Thoát!");
    }

    public static void xuLyMenu(Scanner sc, float a, float b){
        int chon;
        boolean flag = true;
        do {
            inMenu();
            System.out.println("Mời chọn >>");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1 -> {
                    float tong = a + b;
                    System.out.println("Tổng 2 số " + a + "," + b + " là: " + tong);
                }
                case 2 -> {
                    float hieu = a - b;
                    System.out.println("Hiệu 2 số " + a + "," + b + " là: " + hieu);
                }
                case 3 -> {
                    float tich = a * b;
                    System.out.println("Tích 2 số " + a + "," + b + " là: " + tich);
                }
                case 4 -> {
                    float thuong = a / b;
                    if (b == 0) {
                        System.out.println("b phải là số khác 0");
                    } else {
                        System.out.println("Thương 2 số " + a + "," + b + " là: " + thuong);
                    }
                }
                case 0 -> flag = false;
                default -> System.out.println("Vui lòng nhập vào số từ 0-4!");
            }
        } while (flag);
    }
}
