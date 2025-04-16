package day27_multiDimentionalArrays;

import java.util.Arrays;

public class C04_EnUzunKelimeyiYazdirma {

    public static void main(String[] args) {

        String[][] arr = { {"Ali","okula","git"},{"Merhabalar","arkadaslar"},{"Bu","is","olacak"}};

        String enUzunKelime = arr[0][0];



        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].length() > enUzunKelime.length()) {
                    enUzunKelime = arr[i][j];

                }
            }
        }
        System.out.println("Array'deki en uzun kelime: "+enUzunKelime);
    }



}