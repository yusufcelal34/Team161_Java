package pratik;

public class p36_arrays {

    /*
     * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
     *
     * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
     */
    public static void main(String[] args) {
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";


        String[] parcalar = str.split(" ");

        int toplamDolar = 0;
        int toplamSterlin = 0;

        for (String s : parcalar) {
            if (s.contains("$")) {

                toplamDolar += Integer.parseInt(s.replace("$", ""));
            } else if (s.contains("£")) {

                toplamSterlin += Integer.parseInt(s.replace("£", ""));
            }
        }

        System.out.println("Toplam Dolar: $" + toplamDolar);
        System.out.println("Toplam Sterlin: £" + toplamSterlin);
    }
}

