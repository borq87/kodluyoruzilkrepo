package odev;

public class artikYil {
    public static void main(String[] args) {
        int yil;

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        yil = input.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil + " bir artık yıldır.");
                } else {
                    System.out.println(yil + " bir artık yıl değildir.");
                }
            } else {
                System.out.println(yil + " bir artık yıldır.");
            }
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
    
}
