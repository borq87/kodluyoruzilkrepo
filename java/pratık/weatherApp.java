package pratık;

import java.util.Scanner;

public class weatherApp {   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını (C) giriniz: "); 
        int heat = input.nextInt();
        String activity = " ";
        if (heat < 5){
            activity = "kayakla kayak yapmaya gidebilirsiniz.";
        } else if (heat >= 5 && heat < 15) {
            activity = "sinemaya gidebilirsiniz.";
        } else if (heat >= 15 && heat < 25) {
            activity =" pikniğe gidebilirsiniz.";
        } else if (heat >= 25) {
            activity =" yüzmeye gidebilirsiniz.";
        }
        System.out.println("Hava sıcaklığı " + heat + "°C olduğunda bu" + activity );
    }
    
}
