import java.util.Scanner;

public class KoltukSecimi {
    boolean bitir= true;
    public  void koltuk(int kisiSayisi) {

        System.out.println("1 \t  \t 2  3 ");
        System.out.println("4 \t  \t 5  6 ");
        System.out.println("7 \t  \t 8  9 ");
        System.out.println("10\t  \t 11 12 ");
        System.out.println("13\t  \t 14 15 ");
        System.out.println("16\t  \t 17 18 ");
        System.out.println("19\t  \t 20 21 ");
        System.out.println("22\t  \t 23 24 ");

        System.out.print("KOLTUK NO SECİNİZ: ");
        Scanner scanner = new Scanner(System.in);
        int koltuk = scanner.nextInt();

        if (koltuk < 25 && koltuk > 0) {
            System.out.println("");
        } else {
            System.out.println("GIRDIGINIZ NUMARALI KOLTUK BULUNMAMAKTADIR. LUTFEN YENİDEN SECİNİZ..");
            bitir = false;
            //bitir boolean false olursa islem sonlanıyor, kod bitiyor.

        }
    }
}