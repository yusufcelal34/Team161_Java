package day33_parametreliConstructor;

public class C03_ObjeOlusturma {

    public static void main(String[] args) {

C01_Araba araba1 = new C01_Araba();
        System.out.println(araba1);

        C01_Araba araba2 = new C01_Araba("Porche", "910");

        System.out.println(araba2);

        C01_Araba araba3 = new C01_Araba(1010, "mini","country");

        System.out.println(araba3);

        C01_Araba araba4 = new C01_Araba(1011,"Tofaş","Şahin", 1990,130000);

        System.out.println(araba4);
    }
}