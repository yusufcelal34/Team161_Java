package day27_multiDimentionalArrays;

import java.util.Arrays;

public class C07_AyniIndextekiElementlerinToplami {

    public static void main(String[] args) {

        // Verilen 2 katli ve 2 inner array'e sahip int bir array'de
        // ayni index'e sahip elementleri toplayip,
        // yeni olusturacagimiz tek katli bir array'e bu toplamlari atayin.
        //    input :      int[][] arr =  {{3,4,5}, {2,3,6,7}};
        //     output:                       [5, 7, 11]


        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7}};

        int ortakIndexSayisi = arr[0].length < arr[1].length ? arr[0].length : arr[1].length;

        int[] outputArr = new int[ortakIndexSayisi];
        for (int i = 0; i < outputArr.length; i++) {
            outputArr[i] = arr[0][i]+arr[1][i];
        }
        System.out.println(Arrays.toString(outputArr));
    }

}