package day28_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ListdenElemanSilme {

    public static void main(String[] args) {


        List<String> isimler = new ArrayList<>(Arrays.asList("Cennet", "Yusuf", "Mertcan", "Eda"));

        System.out.println(isimler);

        isimler.remove("Cennet");
        System.out.println(isimler);
        isimler.remove(2);
        System.out.println(isimler);

        System.out.println(isimler.remove("mertcan"));
        System.out.println(isimler.remove("Mertcan"));
        System.out.println(isimler);

        System.out.println(isimler.removeFirst());

        System.out.println(isimler.isEmpty());
    }

}
