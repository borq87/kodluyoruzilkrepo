package pratik;

import java.util.Scanner;

public class pisagorTeoremi {
    public static void main(String[] args){
    
        double   a,b,c;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Birinci kenarın uzunluğunu giriniz: ");
        a = girdi.nextInt();
        System.out.print("İkinci kenarın uzunluğunu giriniz: ");    
        b = girdi.nextInt();
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: " + c);
    }
}
