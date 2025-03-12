package PracticeLessons;

public class P21_forLoop {
    public static void main(String[] args) {

        int toplam = 0;
        for (int i = 0; i <= 180; i++) {
            if (i % 8 == 0) {
                toplam += i;

            }
        }
        System.out.println(toplam);
    }
}
