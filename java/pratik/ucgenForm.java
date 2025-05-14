package pratik;

import java.util.Scanner;

public class ucgenForm {
    public static void main(String[] args) {
        double r,cevre,alan,pi=3.14;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen dairenin yarıçapını giriniz: ");
        r = input.nextDouble();

        cevre = 2*pi	*r;
        System.out.println("Dairenin çevresi: " + cevre);
        alan = pi * (r*r);
        System.out.println("Dairenin alanı: " + alan);

        
    }
}
