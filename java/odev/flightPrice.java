package odev;

import java.util.Scanner;

public class flightPrice {
    public static void main(String[] args) {
        
        double  mesefe , yas, fiyat, indirimliFiyat;
        int yolcuTipi;

        Scanner input = new Scanner(System.in); 
        System.out.print("Mesafeyi km olarak giriniz: ");
        mesefe = input.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextDouble();
        System.out.print("Yolculuk tipi (1-Tek yon, 2-Gidis-Donus: ");
        yolcuTipi = input.nextInt();
        fiyat = mesefe * 0.1; // 1 km başına 0.1 TL
        indirimliFiyat = fiyat; // Başlangıçta indirimli fiyat normal fiyata eşit
        if (mesefe < 0 || yas < 0 || (yolcuTipi != 1 && yolcuTipi != 2)) {
            System.out.println("Hatalı veri girdiniz.");
        } else {
            if (yas < 12) {
                indirimliFiyat = fiyat * 0.5; // %50 indirim
            } else if (yas >= 12 && yas < 24) {
                indirimliFiyat = fiyat * 0.9; // %10 indirim
            } else if (yas >= 65) {
                indirimliFiyat = fiyat * 0.7; // %30 indirim
            }
            
            if (yolcuTipi == 2) {
                indirimliFiyat *= 0.8; // Gidiş-dönüş bileti için %20 indirim
            }
            
            System.out.println("Toplam tutar: " + indirimliFiyat + " TL");
        }


    }
    
}
