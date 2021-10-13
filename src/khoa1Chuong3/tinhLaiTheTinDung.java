package khoa1Chuong3;

import java.util.Scanner;

public class tinhLaiTheTinDung {
    public static void main(String[] args){

//        b1: khai báo biến soDu, daThanhToan, chuaThanhToan, laiSuat = 1.5%, tienPhat
//        b2: nhập số dư thẻ tín dụng, tiền thanh toán trong tháng
//        b3: tính tiền chưa thanh toán chuaThanhToan = soDu - daThanhToan
//        b4: tính số tiền phạt tienPhat = chuaThanhToan * laiSuat
//        b5: in ra số tiền lãi phải trả


        float soDu, daThanhToan, chuaThanhToan, tienPhat;
        final float LAI_SUAT = 0.015F;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số dư thẻ tiết kiệm: ");
        soDu = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập vào số tiền đã thanh toán: ");
        daThanhToan = Float.parseFloat(sc.nextLine());
        chuaThanhToan = soDu - daThanhToan;

        if(chuaThanhToan > 0){
            tienPhat = chuaThanhToan * LAI_SUAT;
            System.out.println("Số tiền lãi phải trả tháng này là: " + tienPhat);
        } else {
            System.out.println("Bạn đã thanh toán số dư tháng này!");
        }
    }
}
