package day53_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LinkedList_Queue {

    public static void main(String[] args) {

        Queue<Integer> sayilar = new LinkedList<>();

        sayilar.add(10);
        sayilar.add(25);
        sayilar.add(12);
        sayilar.add(10);
        sayilar.add(45);

        System.out.println(sayilar);

        sayilar.add(87);
        System.out.println(sayilar);

        sayilar.remove();
        System.out.println(sayilar);

        System.out.println(sayilar.peek());
        System.out.println(sayilar.remove());

        System.out.println(sayilar);

        sayilar.poll();
        System.out.println(sayilar);

    }
}