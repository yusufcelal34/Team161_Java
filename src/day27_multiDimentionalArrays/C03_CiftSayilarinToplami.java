package day27_multiDimentionalArrays;

public class C03_CiftSayilarinToplami {

    public static void main(String[] args) {

        int[][] sayilar = {{3, 5, 4}, {2, 3, 6, 8}, {2, 4}, {10}, {3, 9, 0, 2, 7}};


        ciftsSayilarinTopla(sayilar);
    }

    public static void ciftsSayilarinTopla(int[][] arr) {

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 == 0) {
                    toplam += arr[i][j];
                }
            }
        }
        System.out.println("Array'deki çift sayıların toplamı: "+toplam);
    }

}