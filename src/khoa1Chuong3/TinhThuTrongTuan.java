package khoa1Chuong3;

import java.util.Scanner;

public class TinhThuTrongTuan {
    public static void main(String[] args){
        /*
            b1: tạo biến day, month, year, dayOfWeek, top, flag
            b2: in thông báo nhập day
            b3: cho ng dùng nhập và gán vào day
            b4: in thông báo nhập month
            b5: cho ng dùng nhập và gán vào month
            b6: in thông báo nhập year
            b7: cho ng dùng nhập và gán vào year
            b8: xét year. nếu year < 1582 -> tháng ko hợp lệ vì lịch Gregorian bắt đầu từ 1582. bật cờ flag = false
            b9: xét month < 1 hoặc month > 12 -> tháng ko hợp lệ. bật cờ flag = false
            b10: xét ngày -> cần kiểm tra là người dùng nhập vào tháng mấy
            và từ đó lấy ra được số ngày tối đa tương ứng với tháng nhập vào.
            chú ý năm nhuận để xác định số ngày tháng 2. sau đó xét day có đúng hay ko
            b11: tính dayOfWeek theo công thức của Zeller
            b12: xét dayOfWeek và in ra thứ tương ứng
         */

        int d, m, y;
        int top; // số ngày tối đa trong tháng
        boolean flag = true; // bật hợp lệ
        int dayOfweek;
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập ngày ");
        d = Integer.parseInt(sc.nextLine());

        System.out.print("Vui lòng nhập tháng ");
        m = Integer.parseInt(sc.nextLine());

        System.out.print("Vui lòng nhập năm ");
        y = Integer.parseInt(sc.nextLine());

        // xét năm
        if (y<1582){
            flag = false; // năm không hợp lệ
        }
        // xét tháng
        if (m<1 || m>12){
            flag = false; // tháng không hợp lệ
        }
        switch (m){
            case 4:
            case 6:
            case 9:
            case 11:
                top = 30;
                break;
            case 2:
                if (( y % 4 == 0 && y % 100 != 0 ) || ( y % 400 == 0)){   // là năm nhuận
                    top = 29;
                } else {
                    top = 28;
                }
                break;
            default:
                top = 31;
        }
        // xét ngày
        if (d < 1 || d > top){
            flag = false;
        }


        if (!flag){
            System.out.println("Không hợp lệ!");
        } else {
            int a = (14 - m)/12;
            y -= a;
            m = m + 12*a - 2;
            dayOfweek = (d + y + y/4 - y/100 + y/400 + (31*m)/12) % 7;
            if (dayOfweek == 0){
                System.out.println("Chủ nhật");
            } else {
                System.out.println("Thứ " + (dayOfweek + 1));
            }
        }

    }
}
