package day33_parametreliConstructor;

public class Deneme {

    String isim="John Doe";

    int yas = 40;

   public  Deneme(String isim, int yas){

       this.isim = isim;
       this.yas = 30;
   }
   public static void main(String[] args) {

       Deneme obj = new Deneme("Fatih",35);

       System.out.println("isim : " + obj.isim + " yas : " + obj.yas);
   }

}