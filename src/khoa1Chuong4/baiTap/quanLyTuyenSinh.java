package khoa1Chuong4.baiTap;

import java.util.Scanner;

public class quanLyTuyenSinh {

    static final float KHU_VUC_A = 2;
    static final float KHU_VUC_B = 1;
    static final float KHU_VUC_C = 0.5f;

    static final float DOI_TUONG_1 = 2.5f;
    static final float DOI_TUONG_2 = 1.5f;
    static final float DOI_TUONG_3 = 1;

    public static void main(String[] args){
        String khuVuc, doiTuong;
        float diemChuan, diemThi1, diemThi2, diemThi3, diem3Mon, tongDiem, diemKV, diemDT;
        boolean diemLiet;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào điểm chuẩn của hội đồng: ");
        diemChuan = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập vào điểm thi môn thứ nhất: ");
        diemThi1 = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập vào điểm thi môn thứ hai: ");
        diemThi2 = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập vào điểm thi môn thứ ba: ");
        diemThi3 = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập vào khu vực (nếu không thuộc khu vực ưu tiên vui lòng nhập X): ");
        khuVuc = sc.nextLine();
        System.out.print("Nhập vào đối tượng (nếu không thuộc đối tượng ưu tiên vui lòng nhập 0): ");
        doiTuong = sc.nextLine();

        diem3Mon = diemThi1 + diemThi2 + diemThi3;
        diemKV = tinhDiemKhuVuc(khuVuc);
        diemDT = tinhDiemDoiTuong(doiTuong);
        tongDiem = diem3Mon + diemKV + diemDT;
        diemLiet = tinhDiemLiet(diemThi1, diemThi2, diemThi3);
        if (tongDiem >= diemChuan && !diemLiet){
            System.out.println("Tổng điểm: " + tongDiem + "\t Đậu");
        } else if (tongDiem >= diemChuan && diemLiet){
            System.out.println("Tổng điểm: " + tongDiem + "\t Rớt(Có môn bị điểm liệt)");
        } else {
            System.out.println("Tổng điểm: " + tongDiem + "\t Rớt");
        }
    }
    public static float tinhDiemKhuVuc(String khuVuc){
        float diemKV;
        if (khuVuc.equalsIgnoreCase("A")){
            diemKV = KHU_VUC_A;
        } else if (khuVuc.equalsIgnoreCase("B")){
            diemKV = KHU_VUC_B;
        } else if (khuVuc.equalsIgnoreCase("C")){
            diemKV = KHU_VUC_C;
        } else {
            diemKV = 0;
        }
        return diemKV;
    }
    public static float tinhDiemDoiTuong(String doiTuong){
        float diemDT;
        if (doiTuong.equalsIgnoreCase("1")){
            diemDT = DOI_TUONG_1;
        } else if (doiTuong.equalsIgnoreCase("2")){
            diemDT = DOI_TUONG_2;
        } else if (doiTuong.equalsIgnoreCase("3")){
            diemDT = DOI_TUONG_3;
        } else {
            diemDT = 0;
        }
        return diemDT;
    }
    public static boolean tinhDiemLiet(float diemThi1, float diemThi2, float diemThi3){
        boolean flag = false;
        if (diemThi1 == 0 || diemThi2 == 0 || diemThi3 == 0){
            flag = true;
        }
        return flag;
    }



}
