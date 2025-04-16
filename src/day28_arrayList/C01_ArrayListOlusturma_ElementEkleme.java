package day28_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayListOlusturma_ElementEkleme {

    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 6};

        ArrayList<Integer> sayilar1 = new ArrayList<>();

        ArrayList<Integer> sayilar2 = new ArrayList<>();
        List<Integer> sayilar3 = new ArrayList<>();
        List<Integer> sayilar4 = new ArrayList<Integer>();

        List<Integer> sayilar5 = new ArrayList<>();

        System.out.println(sayilar5);

        sayilar5.add(5);
        sayilar5.add(1);
        sayilar5.add(8);
        sayilar5.add(3);

        System.out.println(sayilar5);


        sayilar5.add(2,9);
        System.out.println(sayilar5);

        sayilar1.add(10);
        sayilar1.add(20);
        System.out.println(sayilar1);

        sayilar5.addAll(sayilar1);

        System.out.println(sayilar5);
        System.out.println(sayilar1);

        sayilar5.addAll(1,sayilar1);
        System.out.println(sayilar5);

        // icinde "Cennet", "Yusuf", "Mertcan", "Eda" isimlerinin oldugu bir ArrayList olusturun

        List<String> isimler = new ArrayList<>(Arrays.asList("Cennet", "Yusuf", "Mertcan", "Eda") );

        System.out.println(isimler);
    }
}