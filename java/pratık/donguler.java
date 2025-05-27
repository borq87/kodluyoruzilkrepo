package pratık;

import java.util.Scanner;
public class donguler {
    public static void main(String[] args) {
       /*  int k;
        Scanner imp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        k = imp.nextInt();
        for (int i =1;i<=k;i++){
           if (i %2 == 0){
            continue;
           }
        }
        */

        int k,bolunenSayi=0,kalanSayi=0;
        Scanner imp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        k = imp.nextInt();
        for (int i=1;i<=k;i++){
            if (i %3 == 0 && i %4 == 0) {
                bolunenSayi += i; // Topla
            } else {
                kalanSayi += i; // Topla
            }
           
        }
        double ortalama = (double) bolunenSayi / (k);
         System.out.println(ortalama);

    }
    
}
