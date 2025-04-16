package day26_arrays;

import java.util.Arrays;

public class C03ArrayinElemanlarinSiralama {
    public static void main(String[] args) {

        int[] sayilar ={3,1,9,6,0,12,67,3,8};

        String[] isimler = {"Mert","Murat","Metin","Ali","Yusuf","Mahmut","Can"};

        Arrays.sort(sayilar);
        Arrays.sort(isimler);

        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.toString(isimler));
    }
}
