package day48_abstractClasses_interface;

import java.util.ArrayList;
import java.util.List;

public class C02_Auris extends C01_KuralciToyota {
    @Override
    public void motor() {
        System.out.println("Auris motor");
    }

    @Override
    public void teker() {
        System.out.println("Auris teker");
    }

    public static void main(String[] args) {
        //C01_KuralciToyota toyota = new C01_KuralciToyota()
        //        toyota.motor();
        //        toyota.teker();
        //        toyota.sunroof();
        //        toyota.xenonFar();
        C01_KuralciToyota toyota1 = new C02_Auris();
        toyota1.motor();
        toyota1.teker();
        toyota1.sunroof();
        toyota1.xenonFar();

        List<String> liste = new ArrayList<>();

    }


}
