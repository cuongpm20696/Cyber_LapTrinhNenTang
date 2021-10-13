package khoa1Chuong5;

import java.util.Scanner;

public class viDu1_For {
    public static void main(String[] args){
        System.out.println("Tất cả các số nguyên dương lẻ nhỏ hơn 100 là (Vòng lặp For)");
        inLeLapFor();
        System.out.println("Tất cả các số nguyên dương chẵn nhỏ hơn 100 là (Vòng lặp For)");
        inChanLapFor();
        System.out.println("Tất cả các số nguyên dương lẻ nhỏ hơn 100 là (Vòng lặp While)");
        inLeLapWhie();
        System.out.println("Tất cả các số nguyên dương lẻ nhỏ hơn 100 là (Vòng lặp While)");
        inChanLapWhile();
    }
    public static void inLeLapFor(){
        int n;
        for (n=0; n<100; n++){
            if (n % 2 != 0) {
                System.out.println(n);
            }
        }
    }
    public static void inChanLapFor(){
        int n;
        for (n=0; n<100; n++){
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }
    public static void inLeLapWhie(){
        int n=1;
        while (n < 100){
            System.out.println(n);
            n+=2;
        }
    }
    public static void inChanLapWhile(){
        int n = 0;
        while (n < 100){
            System.out.println(n);
            n+=2;
        }
    }
}
