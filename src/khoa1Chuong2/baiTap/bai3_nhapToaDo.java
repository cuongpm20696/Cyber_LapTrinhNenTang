package khoa1Chuong2.baiTap;

import java.util.Scanner;

public class bai3_nhapToaDo {
    public static void main(String[] args){
        /*
        * b1: tạo biến giá trị float xC, yC, R, xM, yM, khoangCachCM
        * b2: nhập vào các giá trị tung độ, hoành độ của tâm C và điểm M, bán kính R
        * b3: tính khoangCachCM = (xM - xC) * (xM - xC) + (yM - yC) * (yM - yC) , tính bình phương bán kính R2 = R*R
        * b4: dùng if else để xác định vị trí của điểm M
        * b5: in ra kết quả
        * */

        float xC, yC, R, xM, yM, khoangCachCM, R2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tọa độ tâm C(xC,yC)? ");
        xC = Float.parseFloat(sc.nextLine());
        yC = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập bán kính R? ");
        R = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập tọa độ M(xM,yM)? ");
        xM = Float.parseFloat(sc.nextLine());
        yM = Float.parseFloat(sc.nextLine());

        R2 = R*R; // bình phương bán kính R
        khoangCachCM = (xM - xC) * (xM - xC) + (yM - yC) * (yM - yC);

        if (khoangCachCM < R2){
            System.out.println("Điểm M nằm trong hình tròn tâm C");
        } else if (khoangCachCM == R){
            System.out.println("Điểm M nằm trên đường tròn tâm C");
        } else {
            System.out.println("Điểm M nằm ngoài hình tròn tâm C");
        }





    }
}
