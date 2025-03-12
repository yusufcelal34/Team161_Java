package A01_Odev;

import java.util.Scanner;

    public class odev_1 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int vize1 = scanner.nextInt();
            int vize2 = scanner.nextInt();

             int ortalama = (vize1 + vize2) / 2;

                boolean bl = vize1<0 || vize2<0 || vize1>100 || vize2>100;



                if(bl) {

                    System.out.println("Gecerli not giriniz");

                }else if (ortalama > 70) {

                    System.out.println("Woooow!");

                }else if (ortalama > 45) {

                    System.out.println("Hmmmm!");

                }else {

                    System.out.println("Offff!");

                }

        }

    }
