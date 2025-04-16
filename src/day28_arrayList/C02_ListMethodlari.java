package day28_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class C02_ListMethodlari {

    public static void main(String[] args) {


    List<String> isimler = new ArrayList<>(Arrays.asList("Cennet", "Yusuf", "Mertcan", "Eda"));

        System.out.println(isimler.get(0));

        System.out.println(isimler.get(isimler.size()-1));

        for (int i = 0; i < isimler.size(); i++) {

            System.out.print(isimler.get(i) + " ");

        }
        System.out.println();

        System.out.println(isimler.contains("Serpil"));
        System.out.println(isimler.contains("Eda"));
        System.out.println(isimler.contains("eda"));

        System.out.println(isimler);

        isimler.add(1,"Ali");

        System.out.println(isimler);

        isimler.set(1,"Serpil");
        System.out.println(isimler);

        isimler.set(3,"Celal");
        System.out.println(isimler);

}

}
