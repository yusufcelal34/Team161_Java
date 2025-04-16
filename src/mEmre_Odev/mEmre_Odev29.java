package mEmre_Odev;

import java.util.Arrays;

public class mEmre_Odev29 {
    public static void main(String[] args) {

      /*29----
    Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

    Test Data:
    sentence -> "Java is fun"
    reversed -> "fun is Java"
    */
//        String str = "Java is fun"; // string olarak assign ettim.
//
//        String bolunmusStr[] = str.split(" ");
//        System.out.println(Arrays.toString(bolunmusStr));
//
//        String tersCumle = strTersten(bolunmusStr);
//        System.out.println(tersCumle);
//    }
//    private static String strTersten(String bolunmusStr[]) {
//
//        String temp = "";
//
//        for (int i = 0; i < bolunmusStr.length; i++) {
//            temp += bolunmusStr[bolunmusStr.length -1 -i ]; // fun fun fun
//            temp += " ";                                    // fun is Java
//        }
//        return temp;
        String sentence = "Java is fun";

        // Cümleyi kelimelere ayır
        String[] kelimeler = sentence.split(" ");

        // Ters sıralı birleştirme için StringBuilder
        StringBuilder reversed = new StringBuilder();

        // Diziyi tersten döngü ile dolaş
        for (int i = kelimeler.length - 1; i >= 0; i--) {
            reversed.append(kelimeler[i]);

            // Son kelimeye gelinmediyse boşluk ekle
            if (i != 0) {
                reversed.append(" ");
            }
        }

        // Sonucu yazdır
        System.out.println("Girilmiş olan cümle: "+ sentence);
        System.out.println("Ters çevrilmiş cümle: " + reversed.toString());

    }
}
