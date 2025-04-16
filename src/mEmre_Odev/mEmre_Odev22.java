package mEmre_Odev;

public class mEmre_Odev22 {
    public static void main(String[] args) {

         /*22----
    Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

    Array =  [20, 30, 25, 35, -16, 60, -100 ]

    Beklenen Çıktı:
    Array Sayılarının ortalaması: 7.0
    */

       double [] Array =  {20, 30, 25, 35, -16, 60, -100};

       double toplam = 0;

        for (int i =0; i<Array.length;i++) {

            toplam += Array[i];

        }
        System.out.println("Tüm elemanların ntoplamı : " + toplam / Array.length);

    }
}
