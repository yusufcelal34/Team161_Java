package PracticeLessons;

import java.util.Scanner;

public class P01_Calisma {
    public static void main(String[] args) {
         /*

         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output:
           Ad : J*** (Adın baş harfleri ve soyadı büyük olmalıdır)
           Soyad :W****
           kartNo:***********1478

           /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		         1) \\d    ==> tum rakamlar         0->9
		          	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		         2) \\w   ==> A->Z		a->z
		         	 \\W  ==> A->Z		a->z		tum harf disi character ler
		         3) \\s   ==> space
		         	 \\S   ==> space disindaki hersey
         */
        Scanner isim = new Scanner(System.in);
        System.out.println("İsim giriniz : ");
        Scanner soyisim = new Scanner(System.in);
        System.out.print("Soyisim Giriniz : ");
        Scanner kkarti = new Scanner(System.in);
        System.out.print("Kredi Karti numaranızı giriniz : ");

        String isim1 = isim.nextLine().toUpperCase().charAt(1)+"";

    }
}
