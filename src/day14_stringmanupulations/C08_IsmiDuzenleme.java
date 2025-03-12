package day14_stringmanupulations;

import java.util.Scanner;

public class C08_IsmiDuzenleme {
    public static void main(String[] args) {

        // Kullanicidan ismini alin
        // Kullanici 3 isimli olsa da
        // isimlerin ilk harfi buyuk harf, kalanlar * olacak sekilde yazdirin
        // Ornek input  : ali mert can  , aysel yilmaz ,  Kemal
        //       output : A** M*** C**  , A**** Y***** ,  K****

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        int ilkSpaceIndex = isim.indexOf(" ");
        int ikinciSpaceIndex = isim.indexOf(0, ilkSpaceIndex);

        if (ilkSpaceIndex != -1) {
            System.out.println(
                    isim = isim.substring(0, 1).toUpperCase()
                            + isim.substring(1).replaceAll( "\\w", "*"));


        } else if (ikinciSpaceIndex == -1) {
            System.out.println(
                    isim.substring(0, 1).toUpperCase() +
                            isim.substring(1, ilkSpaceIndex).replaceAll("\\w", "*")
                            + " "+
                            isim.substring(ilkSpaceIndex +1 , ilkSpaceIndex+2 ).toUpperCase() +
                            isim.substring(ilkSpaceIndex+2).replaceAll("\\w", "*")
            );
        }
            else{
                System.out.println(
                        isim.substring(0, 1).toUpperCase() +
                                isim.substring(1, ilkSpaceIndex).replaceAll("\\w", "*")
                                + " "+
                                isim.substring(ilkSpaceIndex +1 , ilkSpaceIndex+2 ).toUpperCase() +
                                isim.substring(ilkSpaceIndex+2,ikinciSpaceIndex).replaceAll("\\w", "*")
                                + " "+
                                isim.substring(ikinciSpaceIndex +1 , ikinciSpaceIndex+2 ).toUpperCase() +
                                isim.substring(ikinciSpaceIndex+2,ikinciSpaceIndex+3).toUpperCase()

                );
        }
    }

}
