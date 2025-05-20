package pratık;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args){
        String username, password;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz: ");
        username = inp.nextLine();
        System.out.print("Şifreyi giriniz: ");
        password = inp.nextLine();  

        if (!username.equals("patika") || !password.equals("java123")) {
            System.out.println("Hatalı giriş yaptınız.\n şifrenizi sıfırlamak ister misiniz? (Evet/Hayır)");
            String answer = inp.nextLine();
            if (answer.equals("Evet")) {
                System.out.print("Yeni şifreyi giriniz: ");
                String newPassword = inp.nextLine();
                if (newPassword.equals(password)) {
                    System.out.println("Yeni şifre eski şifreyle aynı olamaz.");
                } else {
                    System.out.println("Şifre başarıyla değiştirildi.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        } else {
            System.out.println("Giriş yaptınız.");
        }
    
        System.out.println("Kullanıcı adı: " + username);   
        System.out.println("Şifre: " + password);
        
    }
    
}
