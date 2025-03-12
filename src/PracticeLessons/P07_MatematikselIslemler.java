package PracticeLessons;

import java.util.Scanner;

public class P07_MatematikselIslemler
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
                boolean devamEt = true;

                while (devamEt) {
                    // Kullanıcıdan sayı ve işlem al
                    System.out.print("Birinci sayıyı giriniz: ");
                    double num1 = scan.nextDouble();

                    System.out.print("İkinci sayıyı giriniz: ");
                    double num2 = scan.nextDouble();

                    System.out.println("Yapmak istediğiniz işlemi seçin:");
                    System.out.println("1 - Toplama (+)");
                    System.out.println("2 - Çıkarma (-)");
                    System.out.println("3 - Çarpma (*)");
                    System.out.println("4 - Bölme (/)");
                    System.out.print("Seçiminiz: ");

                    int secim = scan.nextInt();
                    double sonuc = 0;

                    switch (secim) {
                        case 1:
                            sonuc = num1 + num2;
                            System.out.println("Sonuç: " + sonuc);
                            break;
                        case 2:
                            sonuc = num1 - num2;
                            System.out.println("Sonuç: " + sonuc);
                            break;
                        case 3:
                            sonuc = num1 * num2;
                            System.out.println("Sonuç: " + sonuc);
                            break;
                        case 4:
                            if (num2 != 0) {
                                sonuc = num1 / num2;
                                System.out.println("Sonuç: " + sonuc);
                            } else {
                                System.out.println("Hata: Bir sayı sıfıra bölünemez!");
                            }
                            break;
                        default:
                            System.out.println("Geçersiz seçim! Lütfen 1-4 arasında bir sayı giriniz.");
                    }

                    // Kullanıcıya tekrar yapmak isteyip istemediğini sor
                    System.out.print("Başka bir işlem yapmak ister misiniz? (E/H): ");
                    char tekrar = scan.next().charAt(0);
                    if (tekrar == 'H' || tekrar == 'h') {
                        devamEt = false;
                    }
                }

                System.out.println("Hesap makinesi kapatıldı. İyi günler!");
                scan.close();
            }
        }