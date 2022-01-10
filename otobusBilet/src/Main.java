import java.io.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException, NullPointerException {
        System.out.println("\n*****SEYMEN SEYAHAT FİRMASINA HOS GELDİNİZ***\n");
        YolSaat yolSaat = new YolSaat();
        KoltukSecimi secim = new KoltukSecimi();
        System.out.print("LUTFEN KISI SAYISI GIRINIZ: ");

        Scanner scanner = new Scanner(System.in);
        int kisiSayisi = scanner.nextInt();
        KisiBilgiler kisiBilgileri = new KisiBilgiler();

        if (kisiSayisi > 1) {
            yolSaat.sefer();
            if (yolSaat.terkEt) {

                for (int i = 0; i < kisiSayisi; i++) {
                    if (secim.bitir) {
                        System.out.println((i + 1) + ". kişi oluşturuluyor \n");
                        secim.koltuk(kisiSayisi);
                        kisiBilgileri.kunye();

                    }
                }
                System.out.println("FİŞİNİZ OLUŞTURULDU. TEMSİLİDİR BİLET YERİNE KULLANILMAZ");

            }
        } else if (kisiSayisi < 1) {
            System.out.println("HATALI GIRIS YAPTINIZ!!");

        } else {
            yolSaat.sefer();
            if (yolSaat.terkEt) {
                secim.koltuk(kisiSayisi);
                if (secim.bitir) {
                    kisiBilgileri.kunye();
                    System.out.println("FİŞİNİZ OLUŞTURULDU. TEMSİLİDİR BİLET YERİNE KULLANILMAZ");

                }
            }
        }
        FileWriter fw = new FileWriter("fis.txt");
        PrintWriter pw = new PrintWriter(fw);

        if (secim.bitir && yolSaat.terkEt) {
            try {

                pw.print("SEYAHAT TARİHİNİZ:  ");
                pw.println(yolSaat.date);
                pw.print("BAŞLANGIÇ NOKTANIZ:  ");
                pw.println(yolSaat.baslangic);
                pw.print("VARIŞ NOKTANIZ:  ");
                pw.println(yolSaat.bitis);
                pw.print("OTOBÜS KALKIŞ SAATİNİZ: ");
                pw.println(yolSaat.saatSon);
                pw.print("TOPLAM ÖDEMENİZ GEREKEN ÜCRET: ");
                pw.println((yolSaat.totalUcret * kisiSayisi));
                pw.println("OTOBUS KALKIŞ SAATİNDEN 20 DAKİKA ÖNCE TERMİNALDE OLUNUZ LÜTFEN!!!");
                pw.close();

            }  finally {

                System.out.println("İŞLEM SONLANDIRILDI.");
            }
        }else{

            pw.println("");


        }
    }
}