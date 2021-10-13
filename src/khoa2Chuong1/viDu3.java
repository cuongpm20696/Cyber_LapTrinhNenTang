package khoa2Chuong1;

import java.util.Scanner;

public class viDu3 {
    final static int MIN = -100;
    final static int MAX = 100;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = nhapN(sc);
        int [] a = nhapMang(sc, n);
        xuatMang(a);
        lietKeChiSo(a);

    }
    public static int [] nhapMang(Scanner sc, int n){
        int [] a = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = Integer.parseInt(sc.nextLine());
        }
        return a;
    }
    public static int nhapN(Scanner sc){
        int n;
        do {
            System.out.print("Nhập n > 0 ");
            n = Integer.parseInt(sc.nextLine());
        } while (n < 1);
        return n;
    }
    public static int [] taoMang(int n){
        int [] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = MIN + (int)(Math.random() * ((MAX - MIN) + 1));
        }
        return a;
    }
    public static void xuatMang(int [] a){
        for (int pt : a){
            System.out.print(pt + "\t");
        }
        System.out.println("\n");
    }
    public static int timChiSoAmDauTien(int [] a){
        int index = -1; // chưa tìm thấy số âm
        for (int i = 0; i < a.length; i++){
            if (a[i] < 0){
                index = i; // đã tìm thấy phần tử âm tại chỉ số i
                break; // thoát khỏi vòng lặp vì đã tìm đc phần tử âm đầu tiên
            }
        }
        return index;
    }
    public static void lietKeChiSo(int [] a){
        int index = timChiSoAmDauTien(a);
        if (index == -1){
            System.out.println("Mảng không có số âm!");
        } else {
            System.out.println("Các chỉ số âm tại đó có giá trị bằng " + a[index]);
            for (int i = index; i < a.length; i++){ // duyệt từ index là số âm đàu tiên
                if (a[i] == a[index]){
                    System.out.println(i + "\t");
                }
            }
        }
    }
}
