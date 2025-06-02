package pratık;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
;
        int basValue = 0;
        int result = 0; 



        while(number != 0) {
            basValue = number % 10; // Son basamağı alma
            result +=basValue ;
            number /= 10; // Bir sonraki basamağa geçme

           
        } 
         System.out.println( "Basamaklarin toplami :" +result);
    }
    
}
