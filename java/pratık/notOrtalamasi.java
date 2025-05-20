package pratık;

import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args){

        int mat,fizik,kimya,turkce,tarih,muzik;

       Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notu: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notu: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notu: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notu: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notu: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notu: ");
        muzik = inp.nextInt();

        double ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;
        System.out.println("Ortalamanız: " + ortalama);

        String sonuc =(ortalama >=60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");
        System.out.println(sonuc);
    }
    
    
}
