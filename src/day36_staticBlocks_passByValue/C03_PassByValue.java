package day36_staticBlocks_passByValue;

public class C03_PassByValue {

    public static void main(String[] args) {

        int number = 3;

        int sayi = 12;

        kareAl(number);

        System.out.println("Main method içindeki sayiya bakar : " +sayi);
    }

    public static void kareAl(int sayi){

        System.out.println("Sayının karesi : "+ sayi*sayi);

        System.out.println(sayi);
    }

}
