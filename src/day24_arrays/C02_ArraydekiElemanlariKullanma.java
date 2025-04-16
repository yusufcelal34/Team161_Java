package day24_arrays;

public class C02_ArraydekiElemanlariKullanma {

    public static void main(String[] args) {

        int[] sayilar = {3, 7, 9, 12, 54, 16};

        System.out.println(sayilar[0]);

        sayilar[2] = 29;
        System.out.println(sayilar[2]);
        for (int i = 0; i < sayilar.length; i++) {

            System.out.print(sayilar[i] + " ");

        }
        System.out.println("\n"+sayilar);

    }

}
