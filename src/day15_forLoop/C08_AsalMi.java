package day15_forLoop;

import java.util.Scanner;

public class C08_AsalMi {
    public static void main(String[] args) {

        // Scanner nesnesi oluşturuluyor, kullanıcıdan giriş alabilmek için
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı girmesi isteniyor
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt(); // Kullanıcıdan bir sayı alınıyor

        if (sayi <= 1) {
            System.out.println(sayi + " asal bir sayı değildir.");
        } else {
            boolean asal = true; // Başlangıçta sayıyı asal kabul ediyoruz

            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                if (sayi % i == 0) { // Eğer sayıyı bölen bir sayı bulunursa
                    asal = false;   // Sayı asal değildir
                    break;           // Döngüden çıkıyoruz çünkü asal olmadığını bulduk
                }
            }

            // Sonuç kullanıcıya bildiriliyor
            if (asal) {
                System.out.println(sayi + " asal bir sayıdır.");
            } else {
                System.out.println(sayi + " asal bir sayı değildir.");
            }
        }
    }
}