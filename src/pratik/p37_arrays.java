package pratik;

import java.util.Arrays;

public class p37_arrays {

    // * Parametre olarak dize kabul eden ve rakamların toplamını yazdıran bir yöntem yazın
    // * verilen dizede mevcut girdi : “ade1r4d3” çıktı : 8 hile : Kullan -->
    // * Character.isDigit() --> Integer.valueOf()

    public static void main(String[] args) {

        String kelime = "ade1r4d3";
        String arr[] = kelime.split("");
        System.out.println(Arrays.toString(arr));

        System.out.println("   ");

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i].charAt(0))) {
                toplam += Integer.valueOf(arr[i]);

            }
        }
        System.out.println("Toplam = " + toplam);


//    public static void main(String[] args) {
//
//        String kelime = "a4e8r64fg9b3c10";
//        String arr[] = kelime.split("");
//        System.out.println(Arrays.toString(arr));
//        System.out.println("  ");
//        int toplam = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (Character.isDigit(arr[i].charAt(0))) {
//                toplam += Integer.valueOf(arr[i]);
//            }
//        }
//        System.out.println("toplam = " + toplam);

    }
}
