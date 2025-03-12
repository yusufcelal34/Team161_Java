package PracticeLessons;

import java.util.Scanner;

public class P18_StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İsim Soyisim...:");
        String isimSoyisim = scanner.nextLine();
        String isim = isimSoyisim.substring(0, isimSoyisim.indexOf(" "));
        String ikinIsim = isimSoyisim.substring(isimSoyisim.indexOf(" ") + 1, isimSoyisim.lastIndexOf(" "));
        String soyisim = isimSoyisim.substring(isimSoyisim.lastIndexOf(" ") + 1);
        System.out.println("isim: "+isim +" "+ikinIsim+"\nSoyisim "+soyisim );
    }
}
