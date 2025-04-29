package day54_Maps;

import static day54_maps.MapDepo.ogrenciMap;

public class C04_OrtakMapKullanimi extends day54_maps.MapDepo {

    public static void main(String[] args) {

        System.out.println(ogrenciMap);

        // tum ogrencilerin soyisimlerini yazdirin

        // Map'de islemler kademeli olarak yapildigindan uzun surebilir
        // Madem ki uzun bir kod yaziyoruz
        // bunu method olarak olustursak, sonra lazim oldugunda tekrar tekrar kullansak iyi olmaz mi ?

        tumSoyisimleriYazdir();



        // Tum ogrencilerin no, isim ve soyisimlerini yazdirin
        tumOgrencilerNoIsimSoyisimYazdir();


        // baslangic ve bitis no verildiginde
        // bu numaralar ve arasindaki numaralarin no, isim, soyisim , sinif ve sube'lerini yazdirin

        numaraAraligindakiOgrenciBilgileriniYazdir(101,103);

    }
}