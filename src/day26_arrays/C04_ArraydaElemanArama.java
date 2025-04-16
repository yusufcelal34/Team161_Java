package day26_arrays;

import java.util.Arrays;

public class C04_ArraydaElemanArama {
    public static void main(String[] args) {

        int[] arr = {5,1,8,4,12,-2,7};

        Arrays.sort(arr);

        System.out.println("Sıralama Array: " + Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 1));
        System.out.println(Arrays.binarySearch(arr, 8));
        System.out.println(Arrays.binarySearch(arr, 4));
        System.out.println(Arrays.binarySearch(arr, 12));
        System.out.println(Arrays.binarySearch(arr, -2));
        System.out.println(Arrays.binarySearch(arr, 7));



    }
}
