package pratık;

import java.util.Scanner;

public class faktorıyel {
    public static void main(String[] args) {
       /*  Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n=scan.nextInt();
        int total=1;


        for(int i = 1;i <= n ; i++){

            total = total * i;
        }
        System.out.println("Faktöriyel: " + total);
        */

        int n,r;	
        Scanner scan = new Scanner(System.in);
        System.out.print("n sayısını giriniz: ");
        n = scan.nextInt();
        System.out.print("r sayısını giriniz: ");
        r = scan.nextInt();
        
        for (int i = 1; i <= n; i++) {
          
                int faktoriyelN = 1;
                int faktoriyelR = 1;
                int faktoriyelNR = 1;

                for (int k = 1; k <= n; k++) {
                    faktoriyelN *= k;
                }
                
                for (int l = 1; l <= r; l++) {
                    faktoriyelR *= l;
                }
                
                for (int m = 1; m <= (n - r); m++) {
                    faktoriyelNR *= m;
                }
                
                int kombinasyon = faktoriyelN / (faktoriyelR * faktoriyelNR);
                System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
            }   
      }
    }

