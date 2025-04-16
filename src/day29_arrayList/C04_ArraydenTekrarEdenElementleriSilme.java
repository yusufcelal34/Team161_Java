package day29_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekrarEdenElementleriSilme {

    public static void main(String[] args) {

        Integer[] arr = {3, 5, 6, 8, 2, 3, 5, 1, 4, 8, 6, 2, 3, 4, 8, 1,-1,-1};

        //  Verilen bir array’de
        //  tekrar eden elementler icin, mukerrer olanlari silip,
        //  tum elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.

        arr = getTekrarsizArray(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static Integer[] getTekrarsizArray(Integer[] arr) {


        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!tekrarsizList.contains(arr[i])) {
                tekrarsizList.add(arr[i]);

            }
        }
        System.out.println("\n");
        System.out.println("Tekrarsız Liste " + tekrarsizList);

        System.out.println("\n");

        //arr = tekrarsizList.toArray(new Integer[0]);

        arr = new Integer[tekrarsizList.size()];
        for (int i = 0; i < tekrarsizList.size(); i++) {

            arr[i] = tekrarsizList.get(i);
        }

        System.out.println("Arr'nin son hali " + Arrays.toString(arr));

        // arr ==> [3,5,6,8,2,1,4]

        return arr;
    }
}