package khoa1Chuong3;

import java.util.Scanner;

public class tinhTienLuongOT {
    public static void main(String[] args){
        final int GIO_CO_BAN = 40;
        final float GIO_OVERTIME = 1.5f;
        float gioLam, luongGio, luong;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số giờ làm trong tuần: ");
        gioLam = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập vào lương 1 giờ làm: ");
        luongGio = Float.parseFloat(sc.nextLine());
        if (gioLam > 40){
            luong = GIO_CO_BAN * luongGio + GIO_OVERTIME * luongGio * (gioLam - GIO_CO_BAN);
        } else {
            luong = gioLam * luongGio;
        }
        System.out.println("Lương tuần này là: " + luong);
    }
}
