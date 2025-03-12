package day04_dataCasting;

public class C03_ExplicitNarrowing
{
    public static void main(String[] args) {

        int sayi1 = 17;
        int sayi2 = 125;
        int sayi3 = 134;
        int sayi4 = 145;
        int sayi5 = 260;
        int sayi6 = 520;
        int sayi7 = 1245621;

        byte byt = (byte) sayi1;
        System.out.println(sayi1 + "'nin byte'a cast edilmiş hali : " + byt);

        byte byt2 = (byte) sayi2;
        System.out.println(sayi2 + "'in byte'a cast edilmiş hali : " + byt2);

        byte byt3 = (byte) sayi3;
        System.out.println(sayi3 + "'in byte'a cast edilmiş hali : " + byt3);

        byte byt4 = (byte) sayi4;
        System.out.println(sayi4 + "'in byte'a cast edilmiş hali : " + byt4);

        byte byt5 = (byte) sayi5;
        System.out.println(sayi5 + "'in byte'a cast edilmiş hali : " + byt5);

        byte byt6 = (byte) sayi6;
        System.out.println(sayi6 + "'in byte'a cast edilmiş hali : " + byt6);

        byte byt7 = (byte) sayi7;
        System.out.println(sayi7 + "'in byte'a cast edilmiş hali : " + byt7);

    }
}
