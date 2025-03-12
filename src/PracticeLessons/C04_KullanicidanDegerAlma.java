package PracticeLessons;

import javax.swing.*;
import java.util.Scanner;

public class C04_KullanicidanDegerAlma
{
            public static void main(String[] args) {
            // Kullanıcıdan giriş al
            String isim = JOptionPane.showInputDialog("İsminizi Giriniz");
            String soyisim = JOptionPane.showInputDialog("Soyisminizi Giriniz");
            String yasStr = JOptionPane.showInputDialog("Yaşınızı Giriniz");

            // Yaşı tam sayıya çevirme
            int yas = Integer.parseInt(yasStr);

            // Sonuçları ekrana yazdır
            System.out.println("__________Kullanıcı Bilgileri__________");
            System.out.println("Adı    : " + isim);
            System.out.println("Soyadı : " + soyisim);
            System.out.println("Yaşı   : " + yas);
    }
}
