package day19_methodOlusturma;

public class C05_VkeKullanma {
    public static void main(String[] args) {

        // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        //         kilo*10000 / (boy *boy)
        //         vucut kitle endeksi
        //         30’dan buyukse obez,
        //         25-30 arasi ise kilolu,
        //         20-25 arasi ise normal,
        //         20’den kucukse zayif yazdirin.

        double kitleendeksi=C04_VucutKitleEndexiHesapla.vucutKitleEndeksiHesapla();
        if (kitleendeksi>30)
            System.out.println("obez");
        else if (kitleendeksi>25) {
            System.out.println("kilolu");
        } else if (kitleendeksi>20) {
            System.out.println("normal");
        }
        else
            System.out.println("zayıf");
    }

}
