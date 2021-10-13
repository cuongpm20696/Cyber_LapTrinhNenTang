package khoa1Chuong5;

import java.util.Scanner;

public class viDu1_While {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = demLanThiLai(sc);
        System.out.println("Số lần thi lại là: "+ count);
    }
    public static int demLanThiLai(Scanner sc){
        int count = 0;
        float diem = 0;
        while (diem < 5){
            System.out.print("Nhập vào điểm thi: ");
            diem = Float.parseFloat(sc.nextLine());
            if (diem < 5){
                count ++;
            } else {
                System.out.println("Bạn đã qua kỳ thi!");
            }
        }
        return count;
    }
}
