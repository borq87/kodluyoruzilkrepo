package pratık;
import java.util.Scanner;
public class teksayi {
    public static void main(String[] args) {
        
     /*    int n;
        int toplam = 0;
        Scanner scan =new Scanner(System.in);
       
        do { 
             System.out.print("Bir sayı giriniz: ");
            n = scan.nextInt();
            if (n % 2 == 1) {
                toplam +=n;

           
        } 
    }while (n>0);

    }
    */
        int n;
        int toplam = 0;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.print("Bir sayı giriniz(bitirmek icin negatif bir sayi giriniz): ");
            n = scan.nextInt();
            if (n % 2 == 0 && n%4 == 0) {
                toplam += n;
            }
        } while (n >= 0);
        
        System.out.println("Toplam: " + toplam);
    }
}