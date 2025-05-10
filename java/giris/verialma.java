package giris;

import java.util.Scanner;

public class verialma {
    public static void main(String[] args){

        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: "); 
        a = input.nextInt();
        System.out.println("Girdiğiniz sayı: " + a);

        Scanner input2 = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        double b = input2.nextDouble(); //ve double türünde bir değişken tanımladık
        System.out.println("Girdiğiniz sayı: " + b);


           // String ÖrneğiString adSoyad = inp.nextLine();
           
        // Sayı Örnekleriint yas = inp.nextInt();
        Scanner inp = new Scanner(System.in);
        double maas = inp.nextDouble();
        
        // Çıktılar
        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("Yaş : " + yas);
        System.out.println("Maaş : " + maas);


    }
    
}
