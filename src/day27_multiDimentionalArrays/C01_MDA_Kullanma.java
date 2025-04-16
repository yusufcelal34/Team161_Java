package day27_multiDimentionalArrays;

import java.util.Arrays;

public class C01_MDA_Kullanma {

    public static void main(String[] args) {

       int [][] sayilar = {{3,5,4},{2,3,6,8},{2,4},{1},{3,9,0,2,7}};

        System.out.println(sayilar.length);

        System.out.println(sayilar[4][1]);

        System.out.println(Arrays.toString(sayilar[2]));

        System.out.println(sayilar[3].length);

        System.out.println(Arrays.toString(sayilar[3]));

        System.out.println(sayilar[3] [0]);

        System.out.println(Arrays.toString(sayilar[1]));

        System.out.println(Arrays.deepToString(sayilar));

    }
}