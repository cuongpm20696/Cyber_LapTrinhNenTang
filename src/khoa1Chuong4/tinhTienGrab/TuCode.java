package khoa1Chuong4.tinhTienGrab;

import java.util.Scanner;

public class TuCode {
    //ĐỊNH NGHĨA HẰNG SỐ
    //SỐ TIỀN 1 KM ĐẦU TIÊN CỦA TỪNG LOẠI GRAB
    static final int GRAB_CAR_1_KM = 8000;
    static final int GRAB_SUV_1_KM = 9000;
    static final int GRAB_BLACK_1_KM = 10000;
    //SỐ TIỀN TỪ 1 KM ĐẾN 19 KM
    static final int GRAB_CAR_1_19_KM = 7500;
    static final int GRAB_SUV_1_19_KM = 8500;
    static final int GRAB_BLACK_1_19_KM = 9500;
    //SỐ TIỀN TỪ 19 KM TRỞ LÊN
    static final int GRAB_CAR_19_KM_UP = 7000;
    static final int GRAB_SUV_19_KM_UP = 8000;
    static final int GRAB_BLACK_19_KM_UP = 9000;
    //SỐ TIỀN CHỜ (TRÊN 3 PHÚT)
    static final int GRAB_CAR_WAIT = 2000;
    static final int GRAB_SUV_WAIT = 3000;
    static final int GRAB_BLACK_WAIT = 3500;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // hàm cho người dùng nhập vào
        int loaiGrab = chonGrab(sc);
        float soKM = nhapSoKM(sc);
        int thoiGianCho = nhapThoiGianCho(sc);
        inChiTiet(loaiGrab, soKM, thoiGianCho);
    }

    // HÀM NHẬP VÀO SỐ KM ĐÃ ĐI
    public static float nhapSoKM(Scanner sc){
        float soKM;
        System.out.print("Nhập vào số KM: ");
        soKM = Float.parseFloat(sc.nextLine());
        return soKM;
    }
    // HÀM NHẬP VÀO THỜI GIAN PHẢI CHỜ
    public static int nhapThoiGianCho(Scanner sc){
        int thoiGianCho;
        System.out.print("Nhập vào thời gian chờ: ");
        thoiGianCho = Integer.parseInt(sc.nextLine());
        return thoiGianCho;
    }
    // HÀM CHỌN LOẠI GRAB
    public static int chonGrab(Scanner sc){
        int loai;
        System.out.println("Vui lòng chọn loại Grab");
        System.out.println("1. GRAB CAR");
        System.out.println("2. GRAB SUV");
        System.out.println("3. GRAB BLACK");
        loai = Integer.parseInt(sc.nextLine());
        return loai;
    }
    //HÀM TÍNH TIỀN 1KM
    public static float tinhTien1KM(int loaiGrab){
        float tien;
        if (loaiGrab == 1){
            tien = GRAB_CAR_1_KM;
        } else if (loaiGrab == 2){
            tien = GRAB_SUV_1_KM;
        } else {
            tien = GRAB_BLACK_1_KM;
        }
        return tien;
    }
    //HÀM TÍNH TIỀN TỪ 1 - 19 KM
    public static float tinhTien1Den19KM(int loaiGrab, float soKM){
        float tien;
        if (loaiGrab == 1){
            tien = GRAB_CAR_1_KM + GRAB_CAR_1_19_KM * (soKM - 1);
        } else if (loaiGrab == 2){
            tien = GRAB_SUV_1_KM + GRAB_SUV_1_19_KM * (soKM - 1);
        } else {
            tien = GRAB_BLACK_1_KM + GRAB_BLACK_1_19_KM * (soKM - 1);
        }
        return tien;
    }
    //HÀM TÍNH TIỀN TỪ 19 KM TRỞ LÊN
    public static float tinhTien19KMTroLen(int loaiGrab, float soKM){
        float tien;
        if (loaiGrab == 1){
            tien = GRAB_CAR_1_KM + GRAB_CAR_1_19_KM * 18 + GRAB_CAR_19_KM_UP * (soKM - 19);
        } else if (loaiGrab == 2){
            tien = GRAB_SUV_19_KM_UP + GRAB_SUV_1_19_KM * 18 + GRAB_SUV_19_KM_UP * (soKM - 19);
        } else {
            tien = GRAB_BLACK_19_KM_UP + GRAB_BLACK_1_19_KM * 18 + GRAB_BLACK_19_KM_UP * (soKM - 19);
        }
        return tien;
    }
    //HÀM TÍNH TIỀN CHỜ
    public static float tinhTienCho(int loaiGrab, int thoiGianCho){
        float tien = 0;
        if (thoiGianCho >= 3){
            int soLanTinh = Math.round((thoiGianCho*1.0f)/3);
            if (loaiGrab == 1){
                tien = GRAB_CAR_WAIT * soLanTinh;
            } else if (loaiGrab == 2){
                tien = GRAB_SUV_WAIT * soLanTinh;
            } else {
                tien = GRAB_BLACK_WAIT * soLanTinh;
            }
        }
        return tien;
    }
    //HÀM TÍNH TIỀN PHẢI TRẢ
    public static float tinhTienTra(int loaiGrab, float soKM, int thoiGianCho){
        float tienTra = 0;
        if (soKM <= 1){
            tienTra = tinhTien1KM(loaiGrab) + tinhTienCho(loaiGrab, thoiGianCho);
        } else if (soKM > 1 && soKM < 19){
            tienTra = tinhTien1Den19KM(loaiGrab, soKM) + tinhTienCho(loaiGrab, thoiGianCho);
        } else {
            tienTra = tinhTien19KMTroLen(loaiGrab,soKM) + tinhTienCho(loaiGrab,thoiGianCho);
        }
        return tienTra;
    }
    //IN DÒNG KM ĐẦU TIÊN
    public static void inDong1KM(int loaiGrab, float soKM){
        int donGia;
        if (loaiGrab == 1){
            donGia = GRAB_CAR_1_KM;
        } else if (loaiGrab == 2){
            donGia = GRAB_SUV_1_KM;
        } else {
            donGia = GRAB_BLACK_1_KM;
        }
        if (soKM < 1){
            System.out.println("KM ĐẦU TIÊN \t\t\t" + soKM + "\t\t\t" + donGia + "\t\t\t" + donGia);
        } else {
            System.out.println("KM ĐẦU TIÊN \t\t\t" + 1 + "\t\t\t" + donGia + "\t\t\t" + donGia);
        }
    }
    //IN DÒNG 1 KM ĐẾN 19 KM TRỞ XUỐNG
    public static void inDong1Den19KM(int loaiGrab, float soKM){
        int donGia;
        if (loaiGrab == 1){
            donGia = GRAB_CAR_1_19_KM;
        } else if (loaiGrab == 2){
            donGia = GRAB_SUV_1_19_KM;
        } else {
            donGia = GRAB_BLACK_1_19_KM;
        }
        inDong1KM(loaiGrab, soKM);
        if (soKM < 19){
            System.out.println("Từ 2 km đến " + soKM + " km \t\t" + (soKM - 1) + "\t\t\t" + donGia + "\t\t\t" + donGia * (soKM -1));
        } else {
            System.out.println("Từ 2 km đến " + 18 + " km \t\t" + 18 + "\t\t\t" + donGia + "\t\t\t" + donGia * 18);
        }

    }
    //IN DÒNG 19 KM TRỞ LÊN
    public static void inDong19KMTroLen(int loaiGrab, float soKM){
        int donGia;
        if (loaiGrab == 1){
            donGia = GRAB_CAR_19_KM_UP;
        } else if (loaiGrab == 2){
            donGia = GRAB_SUV_19_KM_UP;
        } else {
            donGia = GRAB_BLACK_19_KM_UP;
        }
        inDong1Den19KM(loaiGrab, soKM);
        System.out.println("Từ 19 km đến " + soKM + " km \t\t" + (soKM - 19) + "\t\t\t" + donGia + "\t\t\t" + donGia * (soKM - 19));
    }
    //IN THỜI GIAN CHỜ
    public static void inThoiGianCho(int loaiGrab, int thoiGianCho){
        int donGia;
        if (loaiGrab == 1){
            donGia = GRAB_CAR_WAIT;
        } else if (loaiGrab == 2){
            donGia = GRAB_SUV_WAIT;
        } else {
            donGia = GRAB_BLACK_WAIT;
        }
        float tienCho = tinhTienCho(loaiGrab, thoiGianCho);
        System.out.println("Thời gian chờ \t\t\t" + thoiGianCho + "\t\t\t" + donGia + "\t\t\t" + tienCho );

    }
    //IN CHI TIẾT BẢNG HÓA ĐƠN
    public static void inChiTiet(int loaiGrab, float soKM, int thoiGianCho){
        System.out.println("************************CHI TIẾT HÓA ĐƠN*********************");
        System.out.println("CHI TIẾT \t\t\t SỬ DỤNG \t ĐƠN GIÁ (1000đ) \t THÀNH TIỀN(1000đ)");
        if (soKM <= 1){
            inDong1KM(loaiGrab, soKM);
        } else if (1<soKM && soKM <19){
            inDong1Den19KM(loaiGrab, soKM);
        } else {
            inDong19KMTroLen(loaiGrab, soKM);
        }
        inThoiGianCho(loaiGrab, thoiGianCho);
        float tongTien = tinhTienTra(loaiGrab, soKM, thoiGianCho);
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t TỔNG TIỀN " + tongTien);
    }
}
