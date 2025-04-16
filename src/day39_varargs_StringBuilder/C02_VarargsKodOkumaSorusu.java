package day39_varargs_StringBuilder;

public class C02_VarargsKodOkumaSorusu {
    public static void main(String[] args) {

islemYap(2,"Ali","Veli","Can");
islemYap(0,"Sinan");
islemYap(4);

    }


    public static void islemYap(int a, String... b){

        System.out.println(b[a].length());

    }
}
