package PracticeLessons;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class P19_StringManipulation {
    public static void main(String[] args) {

    //Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
    // Örn. Yusuf Celal TONBUL -> Y.C.T.  formatıyla yazdırınız.

Scanner scanner = new Scanner(System.in);
System.out.println("İsim Soyisim :");
String isim = scanner.nextLine();
char one=isim.substring(0, isim.indexOf(" ")).charAt(0);
char two=isim.substring(isim.indexOf(" ")+1, isim.lastIndexOf(" ")).charAt(0);
char three = isim.substring(isim.lastIndexOf(" ")+1).toUpperCase().charAt(0);

        System.out.println(one+"."+two+"."+three+".");
    }
}
