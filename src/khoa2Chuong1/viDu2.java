package khoa2Chuong1;

import java.util.Scanner;

public class viDu2 {
    final static int MIN = -100;
    final static int MAX = 100;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = nhapN(sc);
        int [] a = taoMang(n);
        xuatMang(a);
        lietKeTrongDoan(sc, a);
    }
    public static int nhapN(Scanner sc){
        int n;
        do {
            System.out.print("Nhập n > 0 và là số chẵn ");
            n = Integer.parseInt(sc.nextLine());
        } while (n < 1 || n % 2 != 0);
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
    public static void lietKeTrongDoan (Scanner sc, int [] a){
        System.out.print("Nhập vào x dưới: ");
        int x = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập vào y trên: ");
        int y = Integer.parseInt(sc.nextLine());

        for (int pt : a){
            if (pt >= x && pt <= y){
                System.out.print(pt + "\t");
            }
        }
    }
}
