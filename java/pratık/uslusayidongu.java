package pratık;

import java.util.Scanner;

public class uslusayidongu {
    public static void main(String[] args) {
        int n,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        k = input.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= k; i++) {
            sonuc =sonuc * n; // sonuc = sonuc * n;
        }
        System.out.println(n + " sayısının " + k + ". kuvveti: " + sonuc);
        
    }
}   
