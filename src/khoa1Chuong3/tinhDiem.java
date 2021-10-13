package khoa1Chuong3;

import java.util.ArrayList;
import java.util.Scanner;

public class tinhDiem {
    public static void main(String[] args){
        String ten, xepLoai = null;
        float diemToan, diemLy, diemHoa, diemTB;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tên sinh viên");
        ten = sc.nextLine();
        System.out.print("Nhập vào điểm toán: ");
        diemToan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vào điểm lý: ");
        diemLy = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vào điểm hóa: ");
        diemHoa = Integer.parseInt(sc.nextLine());

        diemTB = (diemToan + diemLy + diemHoa)/3;
        if (diemTB >= 8.5){
            xepLoai = "Giỏi";
        } else if (diemTB>=6.5 && diemTB<8.5){
            xepLoai = "Khá";
        } else if (diemTB>=5 && diemTB<6.5){
            xepLoai = "TB";
        } else{
            xepLoai = "Yếu";
        }
        System.out.println("Sinh viên "+ ten+"có xếp loại là " + xepLoai);


    }
}
