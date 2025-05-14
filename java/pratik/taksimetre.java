package pratik;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        double acilisUcreti = 10.0;
        double kmUcreti = 2.20;
        double toplamUcret;
        double gidilenMesafe = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen mesafeyi (km) giriniz: ");
        gidilenMesafe = input.nextDouble();

        toplamUcret = acilisUcreti + (gidilenMesafe * kmUcreti);
        toplamUcret = (toplamUcret < 20) ? 20 : toplamUcret;

        System.out.println("Toplam ücret: " + toplamUcret);
    }
}
