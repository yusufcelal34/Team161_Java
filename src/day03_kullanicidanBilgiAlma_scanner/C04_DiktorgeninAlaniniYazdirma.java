package day03_kullanicidanBilgiAlma_scanner;

import java.util.Scanner;

public class C04_DiktorgeninAlaniniYazdirma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen uzun kenar sayisi giriniz:");
        double alan = scanner.nextDouble();
        System.out.println("Lutfen Kisa Kenar sayisi giriniz:");
        double alan2 = scanner.nextDouble();

        System.out.println("Diktorgenin alani : " + alan * alan2);

    }
}
