package pratik;

import java.util.Scanner; 
public class kdvHesaplama {
    public static void main(String[] args) {
        double tutar,kdvOran=0.18,kdvTutar,kdvliTutar	;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen KDV'siz fiyatı giriniz: ");
        tutar = input.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'li fiyat: " + kdvliTutar);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV'siz fiyat: " + tutar);

    }
}
