package odev;

import java.util.Scanner;

public class vki {
    public static void main(String[] args) {
        
        double kilo,boy,vki;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz: "); 
        kilo = input.nextDouble();

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();

        vki = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: " + vki);   
        
    
    }
}
