import java.util.ArrayList;

public class ListDemo {
    static ArrayList<String> tarih = new ArrayList<>();
    static ArrayList<String> nereden = new ArrayList<>();
    static ArrayList<String> nereye = new ArrayList<>();
    static ArrayList<String> saat = new ArrayList<>();

    public static void tarihMetod(){
        tarih.add("18.01.2022");
        tarih.add("17.01.2022");
        tarih.add("16.01.2022");
        tarih.add("15.01.2022");
        tarih.add("14.01.2022");
        tarih.add("13.01.2022");
        tarih.add("12.01.2022");
        tarih.add("11.01.2022");
        for (int k = 0; k < tarih.size(); k++) {
            System.out.println(tarih.get(k));
        }
    }
    public static void neredenMetod(){
        nereden.add("MANİSA");
        nereden.add("MERSİN");
        nereden.add("ADANA");
        nereden.add("ANTALYA");
        nereden.add("BURSA");
        nereden.add("İZMİR");
        nereden.add("ANKARA");
        nereden.add("İSTANBUL");

        for (int j = 0; j < nereden.size(); j++) {
            System.out.println(nereden.get(j));
        }
    }
    public static void nereyeMetod(){
        nereye.add("MANİSA");
        nereye.add("MERSİN");
        nereye.add("ADANA");
        nereye.add("ANTALYA");
        nereye.add("BURSA");
        nereye.add("İZMİR");
        nereye.add("ANKARA");
        nereye.add("İSTANBUL");

        for (int i = 0; i < nereye.size(); i++) {
            System.out.println(nereye.get(i));
        }
    }
    public static void saatMetod(){
        saat.add("04:00");
        saat.add("06:00");
        saat.add("08:00");
        saat.add("10:00");
        saat.add("12:00");
        saat.add("14:00");
        saat.add("16:00");
        saat.add("18:00");
        for (int a = 0; a < saat.size(); a++) {
            System.out.println(saat.get(a));
        }
    }
}