package day38_localDateTime;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime yerelSaat = LocalTime.now();

        System.out.println(yerelSaat);



        String str = "";
        for (int i = 0; i < 400000; i++) {

            str += i;
        }
        System.out.println(yerelSaat);
    }
}
