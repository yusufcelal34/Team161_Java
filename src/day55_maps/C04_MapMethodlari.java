package day55_maps;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C04_MapMethodlari {
    public static void main(String[] args) {

        Map<String, Integer> harfler = new TreeMap<>();

        harfler.put("A", 45);
        harfler.put("J", 32);
        harfler.put("L", 78);
        harfler.put("Z", 12);
        harfler.put("B", 66);
        harfler.put("G", 24);

        System.out.println(harfler + "\n");

        harfler.remove("A", 45);
        System.out.println(harfler);

        harfler.remove("J");
        System.out.println(harfler);

        harfler.putIfAbsent("A", 56);
        System.out.println(harfler);

        harfler.replace("A", 99);
        System.out.println(harfler);

        harfler.replace("M",22);
        System.out.println(harfler);


    }
}
