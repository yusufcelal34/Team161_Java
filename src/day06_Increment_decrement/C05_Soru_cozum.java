package day06_Increment_decrement;

public class C05_Soru_cozum {
    public static void main(String[] args) {

        int a = 10;
        System.out.println("a'nin degeri : "+ ++a );

        int b = a++;
        System.out.println("b nin degeri : "+ b );

        int c = b++ + a;

        System.out.println("c nin degeri : "+ c);

        System.out.println("Son Toplam :" +(a+b+c) );

    }
}
