package PracticeLessons;

public class P20_StringManipulation {
    public static void main(String[] args) {

    /*
   String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
   String  str1= %13.99
   String str2= %10.55
 */

        String str1="%13.99";
        String str2="%10.55";

        double value1=Double.parseDouble(str1.substring(1));
        double value2=Double.parseDouble(str2.substring(1));

        System.out.println("Toplam : "+(value1+value2));



    }
}
