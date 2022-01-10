import java.time.*;
import java.util.Scanner;

public class YolSaat extends ListDemo {
    boolean terkEt = true;
    double totalUcret;
    String baslangic;
    String bitis;
    String saatSon;
    String date;

    public void sefer() {

        Scanner scan = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        System.out.println("Bugünün Tarihi: " + today);
        LocalTime now = LocalTime.now();
        System.out.println("Saat : " + now);

        ListDemo.tarihMetod();

        System.out.println("LUTFEN SEYAHAT ETMEK İSTEDİĞİNİZ TARİHİ GİRİNİZ: ");

        date = scan.next().toUpperCase();
        double ucretTarih = ListDemo.tarih.indexOf(date) * 5;

        if (ListDemo.tarih.contains(date)) {

            ListDemo.neredenMetod();

            System.out.println("LUTFEN SEYAHAT BASLANGİC NOKTASİ SECİNİZ: ");

            baslangic = scan.next().toUpperCase();
            double ucretBaslangic = ListDemo.nereden.indexOf(baslangic) * 11;

            if (ListDemo.nereden.contains(baslangic)) {

                ListDemo.nereyeMetod();

                System.out.println("LUTFEN SEYAHAT BITIS NOKTASI SECINIZ: ");
                bitis = scan.next().toUpperCase();
                double ucretBitis = ListDemo.nereye.indexOf(bitis) * 12;
                //Fiyatlandırmada kullanılacak olan sehir sıralaması nufus yoğunluguna gore yapıldı

                if (baslangic.equals(bitis)) {
                    System.out.println("BASLANGIC VE BITIS NOKTALARI AYNI SECILDI!!!");
                    terkEt = false;
                } else {
                    if (ListDemo.nereye.contains(bitis)) {

                        ListDemo.saatMetod();

                        System.out.println("LUTFEN SEYAHAT SAATINI SECINIZ: ");
                        saatSon = scan.next();
                        double ucretSaat = ListDemo.saat.indexOf(saatSon) * 13;
                        totalUcret = ucretBaslangic + ucretBitis + ucretSaat + ucretTarih;
                        //saat ilerledikce ucret artacak
                        if (!ListDemo.saat.contains(saatSon)) {
                            System.out.println("LUTFEN LISTEDE BULUNAN SAATLERDE BIR TANESINI GIRINIZ.");
                            System.out.println("HENUZ COK YENI BIR FIRMA OLDUGUMUZ ICIN KISITLI SAATLERDE HIZMET VEREBILIYORUZ :(");
                            terkEt = false;
                        }
                    } else {
                        System.out.println("LUTFEN LISTEDE BULUNAN SEHIRLERDEN BIR TANESINI GIRINIZ.");
                        System.out.println("HENUZ COK YENI BIR FIRMA OLDUGUMUZ ICIN KISITLI SEHIR SAYISINA HIZMET VEREBILIYORUZ :(");
                        terkEt = false;
                        //terkEt boolean false olursa islem sonlanıyor, kod bitiyor.
                    }
                }
            } else {
                System.out.println("LUTFEN LISTEDE BULUNAN SEHIRLERDEN BIR TANESINI GIRINIZ.");
                System.out.println("HENUZ COK YENI BIR FIRMA OLDUGUMUZ ICIN KISITLI SEHIR SAYISINA HIZMET VEREBILIYORUZ :(");
                terkEt = false;
            }
        } else {
            System.out.println("LUTFEN LISTEDE BULUNAN TARİHLERDEN BIR TANESINI GIRINIZ.");
            System.out.println("HENUZ COK YENI BIR FIRMA OLDUGUMUZ ICIN KISITLI TARİHLERDE HIZMET VEREBILIYORUZ :(");
            terkEt=false;
        }
    }
}