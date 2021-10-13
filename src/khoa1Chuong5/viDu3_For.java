package khoa1Chuong5;


import java.util.Scanner;

public class viDu3_For {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số n");
        int n = Integer.parseInt(sc.nextLine());
        int dem = demSoChiaHetCho3(n);
        System.out.println("Từ 0 đến " + n + " có " + dem + " số chia hết cho 3.");
    }
    public static int demSoChiaHetCho3(int n){
        int dem = 0;
        for (int i = 1; i < n; i++){
            if (i % 3 == 0){
                dem++;
            }
        }
        return dem;
    }

}
