package khoa1Chuong5.baiTap;

import java.util.Scanner;

public class b1 {
    static final int BAO = 1;
    static final int BUA = 2;
    static final int KEO = 3;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nguoiChoiThang = 0;
        int mayThang = 0;
        boolean flag = true;
        while (flag){
            int nguoiChoi = nguoiChoiNhap(sc);
            int may = (int) (Math.random() * 3 + 1);
            if (nguoiChoi < 0 || nguoiChoi > 3){
                System.out.println("Hãy nhập vào số từ 0 - 3!!!");
            } else if (nguoiChoi == 0){
                flag = false;
            } else if (nguoiChoi == may){
                System.out.println("Hòa!");
            } else if (nguoiChoi == BAO && may == BUA){
                System.out.println("Người chơi thắng");
                nguoiChoiThang++;
            } else if (nguoiChoi == BUA && may == KEO){
                System.out.println("Người chơi thắng");
                nguoiChoiThang++;
            } else if (nguoiChoi == KEO && may == BAO){
                System.out.println("Người chơi thắng");
                nguoiChoiThang++;
            } else {
                System.out.println("Máy thắng");
                mayThang++;
            }
        }
        if (nguoiChoiThang > mayThang){
            System.out.println("Người chơi là người chiến thắng");
            System.out.println("Tỷ  số là " + nguoiChoiThang + "-" + mayThang);
        } else {
            System.out.println("Máy là người chiến thắng");
            System.out.println("Tỷ số là " + mayThang + "-" + nguoiChoiThang);
        }
    }

    public static int nguoiChoiNhap(Scanner sc){
        System.out.println("Mời nhập vào số từ 1 - 3 ");
        System.out.println("1. Bao");
        System.out.println("2. Búa");
        System.out.println("3. Kéo");
        System.out.println("0. Kết thúc trò chơi");
        int nhap = Integer.parseInt(sc.nextLine());
        return nhap;
    }

}
