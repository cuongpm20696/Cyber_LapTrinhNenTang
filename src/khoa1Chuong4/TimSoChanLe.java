package khoa1Chuong4;

import java.util.Scanner;

public class TimSoChanLe {
        /*
        * b1: tạo hàm kiemTraChanLe với tham số đầu vào là một số nguyên trả về kiểu boolean
        * b2: xét số đã cho % 2
        * b3: vào hàm main, thông báo cho nhập số nguyên
        * b4: gọi hàm kiemTraChanLe và thông báo kết quả
        *  */


    public static boolean kiemTraChanLe(int a){
        boolean kQua;
        if (a % 2 == 0){
            kQua = true;
        } else {
            kQua = false;
        }
        return kQua;
    }



    public static void main(String[] args){
        String soA;
        System.out.println("Chương trình tìm số chẵn lẻ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào 1 số nguyên ");
        int a = Integer.parseInt(sc.nextLine());
        boolean kQua = kiemTraChanLe(a);
        if (kQua){
            soA = " là số chẵn";
        } else {
            soA = " là số lẻ";
        }
        System.out.print("Số " + a + soA);
    }
}
