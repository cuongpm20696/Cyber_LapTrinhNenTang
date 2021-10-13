package khoa1Chuong2.baiTap;

import java.util.Scanner;

public class caseStudy {
    public static void main(String[] args){
        /*
        * b1: tạo biến chieuDaiSan, banKinhCayPhatTrien, khongGianCan, soLuongCay, tongKhongGian
        * b2: nhập chiều dài sân chieuDaiSan, bán kính của 1 cây phát triển đầy đủ banKinhCayPhatTrien, không gian cần thiết khongGianCan
        * b3: tính số cây có thể trồng soLuongCay = chieuDaiSan / (banKinhCayPhatTrien * 2 + khongGianCan)
        * b4: tính tổng không gian sẽ được chiếm bởi những cây được trồng hoàn toàn tongKhongGian = (banKinhCayPhatTrien * 2 + khongGianCan) * soLuongCay
        * b5: in ra kết quả
        * */

        int chieuDaiSan, banKinhCayPhatTrien, khongGianCan, tongKhongGian, soLuongCay;


        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chiều dài của sân: ");
        chieuDaiSan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vào bán kính của một cây phát triển đầy đủ: ");
        banKinhCayPhatTrien = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vào không gian cần thiết giữa các cây phát triển đầy đủ: ");
        khongGianCan = Integer.parseInt(sc.nextLine());

        // tính số lượng cây
        soLuongCay = chieuDaiSan / (banKinhCayPhatTrien * 2 + khongGianCan);
        // tổng không gian sẽ được chiếm bởi những cây được trồng hoàn toàn
        tongKhongGian = (banKinhCayPhatTrien * 2 + khongGianCan) * soLuongCay;

        System.out.println("Số lượng cây có thể trồng trong sân là: " + soLuongCay);
        System.out.println("Tổng không gian sẽ được chiếm bởi những cây được trông hoàn toàn là: "+ tongKhongGian);




    }
}
