package day27_multiDimentionalArrays;

import java.util.Arrays;

public class C06_InnerArraylerdekiSonElementlerinToplami {

    public static void main(String[] args) {

        int[][] sayilar = {{3, 5, 4}, {2, 3, 6, 8}, {2, 4}, {10}, {3, 9, 0, 2, 7}};

        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {
            int sonEleman = sayilar[i][sayilar[i].length - 1];
            toplam += sonEleman;
        }
        System.out.println(toplam);
    }

}