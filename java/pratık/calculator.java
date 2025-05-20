package pratık;

import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        int n1,n2,select;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.println("Lütfen 2. sayıyı giriniz: ");  
        n2 = input.nextInt();
        
        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.println("Lütfen işlemi seçiniz: ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplama işlemi sonucu: " + (n1+n2));
                break;  
            case 2:
                System.out.println("Çıkarma işlemi sonucu: " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma işlemi sonucu: " + (n1*n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme işlemi sonucu: " + (n1/n2));
                } else {
                    System.out.println("Bir sayıyı 0'a bölemezsiniz.");
                }
                break;
        }
    }
}