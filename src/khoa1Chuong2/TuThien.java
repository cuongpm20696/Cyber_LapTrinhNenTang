package khoa1Chuong2;

import java.util.Scanner;

public class TuThien {
    public static void main(String[] args){
        final int NUM_CHAR_PADD_LEFT = -50;
        String tenPhim;
        int giaVeNguoiLon,
                giaVeTreEm,
                soVeNguoiLon,
                soVeTreEm,
                tongVe,
                doanhThu,
                phanTramTuThien,
                tienTuThien,
                doanhThuThuc;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tên phim: ");
        tenPhim = sc.nextLine();
        System.out.print("Nhập vào giá vé người lớn: ");
        giaVeNguoiLon = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vào giá vé trẻ em: ");
        giaVeTreEm = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vào số vé người lớn đã bán: ");
        soVeNguoiLon = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vào số vé trẻ em đã bán: ");
        soVeTreEm = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vào số phần trăm trích từ thiện: ");
        phanTramTuThien = Integer.parseInt(sc.nextLine());

        tongVe = soVeNguoiLon + soVeTreEm;
        doanhThu = soVeNguoiLon * giaVeNguoiLon + soVeTreEm * giaVeTreEm;
        tienTuThien = doanhThu/100 * phanTramTuThien;
        doanhThuThuc = doanhThu - tienTuThien;


        System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        String text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s", "Tên-phim:").replace(' ','.').replace('-',' ');
        System.out.println(text + tenPhim);
        text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s", "Số-vé-đã-bán:").replace(' ','.').replace('-',' ');
        System.out.println(text + tongVe);
        text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s", "Doanh-thu:").replace(' ','.').replace('-',' ');
        System.out.println(text + doanhThu);
        text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s", "Trích-%-từ-thiện:").replace(' ','.').replace('-',' ');
        System.out.println(text + phanTramTuThien + "%");
        text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s", "Tổng-tiền-trích-từ-thiện:").replace(' ','.').replace('-',' ');
        System.out.println("Tổng tiền trích từ thiện: " + tienTuThien);
        text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s", "Tổng-thu-được-sau-khi-từ-thiện:").replace(' ','.').replace('-',' ');
        System.out.println(text + doanhThuThuc);


    }
}
