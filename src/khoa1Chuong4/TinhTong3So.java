package khoa1Chuong4;

import java.util.Scanner;

public class TinhTong3So {
    /*
    * b1: tạo hàm tong3So với tham số đầu vào 3 số
    * b2: tính tổng 3 số trả về
    * b3: vào hàm main, thông báo và cho nhập 3 số
    * b4: gọi hàm tong3So và thông báo kết quả
    * */

    public static float tong3So(float a, float b, float c){
        float tong = a + b + c;
        return tong;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chương trình tính tổng 3 số: ");
        System.out.print("Nhập vào số thứ nhất ");
        float a = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập vào số thứ hai ");
        float b = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập vào số thứ ba ");
        float c = Float.parseFloat(sc.nextLine());

        float tong = tong3So(a, b, c);
        System.out.println("Tổng 3 số " + a + " " + b + " " + c + " " + " là " + tong);
    }
}
