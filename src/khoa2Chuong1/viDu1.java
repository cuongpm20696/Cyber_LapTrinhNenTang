package khoa2Chuong1;

import java.util.Scanner;

public class viDu1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào phần tử n ");
        int n = Integer.parseInt(sc.nextLine());
        int [] a = nhapMang(sc, n);
        xuatMangForEach(a);
        int tongChan = tinhTongChan(a);
        System.out.println("\nTổng các số chẵn trong mảng là " + tongChan);
        int soAm = demSoAm(a);
        System.out.println("Số số âm có trong mảng là: " + soAm);
        int tongAm = tinhTongAm(a);
        System.out.println("Tổng các số âm có tỏng mảng là " + tongAm);
    }
    public static int [] nhapMang (Scanner sc, int n){
        int[] a = new int[n];
        System.out.println("Nhập mảng");
        for (int i = 0; i < n; i++){
            System.out.println("a[" + i + "]");
            a[i] = Integer.parseInt(sc.nextLine());
        }
        return a;
    }
//    public static void xuatMangFor (int[] a){
//        System.out.println("Xuất mảng");
//        for (int i = 0; i < a.length; i++){
//            System.out.print(a[i] + "\t");
//        }
//    }
    public static void xuatMangForEach (int[] a){
        System.out.println("Xuất mảng");
        for (int item: a){
            System.out.print(item + "\t");
        }
    }
    public static int tinhTongChan (int [] a){
        int tong = 0;
        for (int item: a){
            if (item % 2 == 0){
                tong += item;
            }
        }
        return tong;
    }
    public static int demSoAm(int [] a){
        int dem = 0;
        for (int item : a){
            if (item < 0){
                dem++;
            }
        }
        return dem;
    }
    public static int tinhTongAm (int [] a){
        int tong = 0;
        for (int item : a){
            if (item < 0){
                tong += item;
            }
        }
        return tong;
    }

}
