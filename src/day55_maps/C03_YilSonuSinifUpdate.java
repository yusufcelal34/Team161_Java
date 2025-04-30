package day55_maps;

public class C03_YilSonuSinifUpdate extends day54_maps.MapDepo {

    public static void main(String[] args) {

        // Yil sonunda calisacak sekilde
        // tum ogrencileri sube ayni kalacak sekilde bir ust sinifa tasiyin
        // Not : 12.siniftakiler ==> mezun olacak
        // mezun olanlar ayni kalacak

        System.out.println(ogrenciMap);

        yilSOnuSinifArttir();;
        System.out.println(ogrenciMap);

    }
}
