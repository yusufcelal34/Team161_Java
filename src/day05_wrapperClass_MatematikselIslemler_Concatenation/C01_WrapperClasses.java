package day05_wrapperClass_MatematikselIslemler_Concatenation;

public class C01_WrapperClasses {

    public static void main(String[] args) {

        int sayiInt = 10;
        Integer sayiWrapperInt = sayiInt;

        sayiWrapperInt = 40;
        sayiInt = sayiWrapperInt;

        String fiyat1 = "9.94";
        String fiyat2 = "21.74";
        String fiyat3 = "14.86";

        System.out.println( fiyat1 + fiyat2 + fiyat3 );

        double fyt1Dob = Double.parseDouble(fiyat1);
        double fyt2Dob = Double.parseDouble(fiyat2);
        double fyt3Dob = Double.parseDouble(fiyat3);

        System.out.println( "Ortalama fiyat : " + (fyt1Dob + fyt2Dob + fyt3Dob)/3 );

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        char chr = 'a';
        System.out.println(Character.isUpperCase(chr));
        System.out.println(Character.isDigit(chr));
        System.out.println(Character.isLetter(chr));
        System.out.println(Character.isAlphabetic(chr));


        String str = "Java Candir";
        System.out.println(str.toUpperCase());

        chr = 'a';

        System.out.println(Character.toUpperCase(chr));


    }
}
