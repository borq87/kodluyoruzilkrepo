package odev;

import java.util.Scanner;

public class chineseZodiac {
    public static void main(String[] args) {
        int yil;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        yil = input.nextInt();  

        if (yil %12 == 0  ){
            System.out.println("Çin Zodyağı Burcunuz: Maymun");
        } else if (yil % 12 == 1) {
            System.out.println("Çin Zodyağı Burcunuz: Horoz");
        } else if (yil % 12 == 2) {
            System.out.println("Çin Zodyağı Burcunuz: Köpek");
        } else if (yil % 12 == 3) {
            System.out.println("Çin Zodyağı Burcunuz: Domuz");
        } else if (yil % 12 == 4) {
            System.out.println("Çin Zodyağı Burcunuz: Fare");
        } else if (yil % 12 == 5) {
            System.out.println("Çin Zodyağı Burcunuz: Sığır");
        } else if (yil % 12 == 6) {
            System.out.println("Çin Zodyağı Burcunuz: Kaplan");
        } else if (yil % 12 == 7) {
            System.out.println("Çin Zodyağı Burcunuz: Tavşan");
        } else if (yil % 12 == 8) {
            System.out.println("Çin Zodyağı Burcunuz: Ejderha");
        } else if (yil % 12 == 9) {
            System.out.println("Çin Zodyağı Burcunuz: Yılan");
        } else if (yil % 12 == 10) {
            System.out.println("Çin Zodyağı Burcunuz: At");
        } else if (yil % 12 == 11) {
            System.out.println("Çin Zodyağı Burcunuz: Koyun");
        } else {
            System.out.println("Geçersiz yıl girdiniz.");
        }
    }
    
}
