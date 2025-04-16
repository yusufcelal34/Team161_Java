package day29_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Remove {

    public static void main(String[] args) {


        List<String> harfler = new ArrayList<>(Arrays.asList("a", "d", "r", "t", "a", "g", "l", "d", "r", "t", "a"));
        System.out.println(harfler);

        System.out.println(harfler.remove("d"));

        System.out.println(harfler);

        ArrayList<Integer> sayilar = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 3, 2, 5, 7));

        System.out.println(sayilar);

        int silinecekSayiler = 8;

        System.out.println(silinecekSayiler);

        System.out.println(sayilar);
    }
}
