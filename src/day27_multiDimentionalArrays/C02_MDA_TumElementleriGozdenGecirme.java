package day27_multiDimentionalArrays;

import java.util.Arrays;

public class C02_MDA_TumElementleriGozdenGecirme {

    public static void main(String[] args) {

        int[][] sayilar = {{3, 5, 4}, {2, 3, 6, 8}, {2, 4}, {1}, {3, 9, 0, 2, 7}};

        int[] numbers = {3, 7, 8, 1};

        int toplam = 0;

        for (int i = 0; i < numbers.length; i++) {
            //toplam += numbers[i];
        }
        //System.out.println("Numabers'daki elemanların toplamı: " + toplam);


        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.print(sayilar[i][j] + " ");
                toplam += sayilar[i][j];
            }
            System.out.println();


//        System.out.println(sayilar.length);
//        System.out.println(sayilar[4][1]);
//        System.out.println(Arrays.toString(sayilar[2]));
//        System.out.println(sayilar[3].length);
//        System.out.println(Arrays.toString(sayilar[3]));
//        System.out.println(sayilar[3] [0]);
//        System.out.println(Arrays.toString(sayilar[1]));
//        System.out.println(Arrays.deepToString(sayilar));
        }
        System.out.println(toplam);
    }
}