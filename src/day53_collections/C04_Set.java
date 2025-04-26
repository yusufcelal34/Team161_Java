package day53_collections;

import java.util.HashSet;
import java.util.Set;

public class C04_Set {

    public static void main(String[] args) {

        Set<String> isimler = new HashSet();

        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Can");

        System.out.println(isimler);

        isimler.add("Kemal");

        System.out.println(isimler);

        isimler.add("Veli");
        isimler.add("Can");

        System.out.println(isimler);

    }
}
