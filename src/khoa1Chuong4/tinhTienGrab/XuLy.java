package khoa1Chuong4.tinhTienGrab;

import java.util.Scanner;

public class XuLy {

     static final int GRAB_CAR_1KM = 8000;
     static final int GRAB_SUV_1KM = 9000;
     static final int GRAB_BLACK_1KM = 10000;

    static final int GRAB_CAR_1TO_19 = 7500;
    static final int GRAB_SUV_1TO_19 = 8500;
    static final int GRAB_BLACK_1TO_19 = 9600;

    static final int GRAB_CAR_UPPER_19 = 7000;
    static final int GRAB_SUV_UPPER_19 = 8000;
    static final int GRAB_BLACK_UPPER_19 = 9000;

    static final int GRAB_CAR_WAIT = 2000;
    static final int GRAB_SUV_WAIT = 3000;
    static final int GRAB_BLACK_WAIT = 3500;

    public XuLy(){

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int loaiGrab = chonGrab(sc);
        float soKM = nhapSoKM(sc);
        int thoiGianCho = nhapThoiGianCho(sc);
        float tienTra = tinhTienTra(loaiGrab, soKM, thoiGianCho);

        System.out.println("Số tiền phải trả là: " + tienTra);
        inChiTiet(loaiGrab, soKM, thoiGianCho);
    }

    public static float nhapSoKM(Scanner sc){
        float soKM;
        System.out.print("Nhập vào số km: ");
        soKM = Float.parseFloat(sc.nextLine());
        return soKM;
    }
    public static int nhapThoiGianCho(Scanner sc){
        int thoiGianCho;
        System.out.print("Nhập vào thời gian chờ: ");
        thoiGianCho = Integer.parseInt(sc.nextLine());
        return thoiGianCho;
    }
    public static int chonGrab(Scanner sc){
        int loai;

        System.out.println("Vui lòng chọn loại Grab: ");
        System.out.println("1. Grab Car");
        System.out.println("2. Grab SUV");
        System.out.println("3. Grab Black");
        loai = Integer.parseInt(sc.nextLine());

        return loai;
    }

    public static float tinhTienKMDauTien(int loaiGrab){
        float tien = 0;
        if (loaiGrab == 1){
            tien = GRAB_CAR_1KM;
        } else if (loaiGrab == 2){
            tien = GRAB_SUV_1KM;
        } else {
            tien = GRAB_BLACK_1KM;
        }

    return tien;
    }

    public static float tinhTienKM1Den19(float soKM, int loaiGrab){
        float tien = 0;
        if (loaiGrab == 1){
            tien = GRAB_CAR_1KM + (soKM - 1) * GRAB_CAR_1TO_19;
        } else if (loaiGrab == 2){
            tien = GRAB_SUV_1KM + (soKM - 1) * GRAB_SUV_1TO_19;
        } else {
            tien = GRAB_BLACK_1KM + (soKM -1) * GRAB_BLACK_1TO_19;
        }
        return tien;
    }

    public static float tinhTienKMTren19 (float soKM, int loaiGrab){
        float tien = 0;
        if (loaiGrab == 1){
            tien = GRAB_CAR_1KM + 18 * GRAB_CAR_1TO_19 + (soKM - 19) * GRAB_CAR_UPPER_19;
        } else if (loaiGrab == 2){
            tien = GRAB_SUV_1KM + 18 * GRAB_SUV_1TO_19 + (soKM - 19) * GRAB_SUV_UPPER_19;
        } else {
            tien = GRAB_BLACK_1KM + 18 * GRAB_BLACK_1TO_19 + (soKM - 19) * GRAB_BLACK_UPPER_19;
        }
        return tien;
    }
    public static float tinhTienCho(int loaiGrab, int thoiGianCho){
        float tien = 0;

        if (thoiGianCho >= 3){
            int soLanTinh = Math.round((thoiGianCho*1.0f)/3) ;
            if (loaiGrab == 1){
                tien = soLanTinh * GRAB_CAR_WAIT;
            } else if (loaiGrab == 2){
                tien = soLanTinh * GRAB_SUV_WAIT;
            } else {
                tien = soLanTinh * GRAB_BLACK_WAIT;
            }
        }
        return tien;
    }

    public static float tinhTienTra(int loaiGrab, float soKM, int thoiGianCho){
        float tienTra = 0;
        if (soKM <= 1){
            tienTra = tinhTienKMDauTien(loaiGrab) + tinhTienCho(loaiGrab, thoiGianCho);
        } else if (soKM > 1 && soKM < 19){
            tienTra = tinhTienKM1Den19(soKM, loaiGrab) + tinhTienCho(loaiGrab, thoiGianCho);
        } else  {
            tienTra = tinhTienKMTren19(soKM, loaiGrab) + tinhTienCho(loaiGrab, thoiGianCho);
        }
        return tienTra;
    }

    public static void inDongKm1 (int loaiGrab, float soKM){
        int donGia;
        if (loaiGrab == 1){
            donGia = GRAB_CAR_1KM;
        } else if (loaiGrab == 2){
            donGia = GRAB_SUV_1KM;
        } else {
            donGia = GRAB_BLACK_1KM;
        }
        if (soKM < 1){
            System.out.println("KM ĐẦU TIÊN \t\t" + soKM + "\t\t\t" + donGia + "\t\t\t" + donGia);
        } else {
            System.out.println("KM ĐẦU TIÊN \t\t" + 1 + "\t\t\t" + donGia + "\t\t\t" + donGia);
        }
    }

    public static void inDongKm1Den19 (int loaiGrab, float soKM){
        int donGia;
        if (loaiGrab == 1){
            donGia = GRAB_CAR_1TO_19;
        } else if (loaiGrab == 2){
            donGia = GRAB_SUV_1TO_19;
        } else {
            donGia = GRAB_BLACK_1TO_19;
        }
        inDongKm1(loaiGrab, soKM);
        if (soKM < 19){
            System.out.println("Từ 2 đến " + (soKM - 1) + "\t\t" + (soKM - 1) + "\t\t\t" + donGia + "\t\t\t" + donGia * (soKM -1));
        } else {
            System.out.println("Từ 2 đến " + 18 + "\t\t" + 18 + "\t\t\t" + donGia + "\t\t\t" + donGia * 18);
        }
    }

    public static void inDongKmTren19 (int loaiGrab, float soKM){
        int donGia;
        if (loaiGrab == 1){
            donGia = GRAB_CAR_UPPER_19;
        } else if (loaiGrab == 2){
            donGia = GRAB_SUV_UPPER_19;
        } else {
            donGia = GRAB_BLACK_UPPER_19;
        }
        inDongKm1Den19(loaiGrab, soKM);
        System.out.println("Từ 19 đến " + soKM + "\t\t" + (soKM - 19) + "\t\t\t" + donGia + "\t\t\t" + donGia * (soKM - 19));
    }

    public static void inThoiGianCho (int loaiGrab, int thoiGianCho){
        int donGia;
        if (loaiGrab == 1){
            donGia = GRAB_CAR_WAIT;
        } else if (loaiGrab == 2){
            donGia = GRAB_SUV_WAIT;
        } else {
            donGia = GRAB_BLACK_WAIT;
        }
        float tienCho = tinhTienCho(loaiGrab, thoiGianCho);
        System.out.println("Thời gian chờ \t\t" + thoiGianCho + "\t\t\t" + donGia + "\t\t\t" + tienCho);
    }

    public static void inChiTiet (int loaiGrab, float soKM, int thoiGianCho){
        System.out.println("*********************** CHI TIẾT HÓA ĐƠN *********************");
        System.out.println("CHI TIẾT \t\t SỬ DỤNG \t ĐƠN GIÁ(1000Đ) \t THÀNH TIỀN(1000Đ)");
        if (soKM < 1){
            inDongKm1(loaiGrab, soKM);
        } else if (1 < soKM && soKM < 19){
            inDongKm1Den19(loaiGrab, soKM);
        } else {
            inDongKmTren19(loaiGrab, soKM);
        }

        inThoiGianCho(loaiGrab, thoiGianCho);
        float tongTien = tinhTienTra(loaiGrab, soKM, thoiGianCho);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t TỔNG TIỀN" + tongTien);

    }

}
