package day14_stringmanupulations;

import java.util.Scanner;

public class C04_StringFiyatlariToplama {
    public static void main(String[] args) {

        // Kullanicinin belirli bir formatta verdigi String fiyatlari
        // toplayip yazdirin.
        //		input1 : “15.30 €” , input2 : “11.45 €”
        //		output : 26.75 €
        // NOT : sondaki para birimi degisken olmalidir

        String fiyatS1 = "15.30 €";
        String fiyatS2 = "11.45 €";

        System.out.println(fiyatS1 + fiyatS2);

        int sonBoslukIndexi = fiyatS1.lastIndexOf(" ");
        String paraBirimi = fiyatS1.substring(sonBoslukIndexi);

        fiyatS1 = fiyatS1.replaceAll("\\D","" );
        fiyatS2 = fiyatS2.replaceAll("\\D","" );

        double fiyat01 = Double.parseDouble(fiyatS1) / 100;
        double fiyat02 = Double.parseDouble(fiyatS2) / 100;

        System.out.println(fiyat01 + fiyat02 + paraBirimi);


    }
}