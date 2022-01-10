import java.util.Scanner;

public class KisiBilgiler {
    Scanner scan = new Scanner(System.in);

    public  void kunye(){
        System.out.println("KISI BILGILERINIZI YAZINIZ.");
        System.out.print("Adınız: ");
        String name = scan.next();
        System.out.print("Soyadınız: ");
        String soyad = scan.next();
        System.out.print("TC no giriniz: ");
        String tcNo= scan.next();
        System.out.print("E-mail adresiniz: ");
        String eMail=scan.next();
        System.out.print("Telefon numaranizi giriniz: ");
        String telNo =scan.next();
        System.out.print("HES kodu giriniz:");
        String hes = scan.next();
        System.out.println("\nKİSİ BİLGİLERİNİZ ALINMISTIR.\n");
    }
}