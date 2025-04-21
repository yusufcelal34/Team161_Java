package pratik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p39_arrays {

    public static void main(String[] args) {


    /*
     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir program yaziniz
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */


        List<String> list = new ArrayList<String>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));

        List<String> newList =new ArrayList<>() ;

        for(String each : list){
            if(each.toLowerCase().contains("a")){
                newList.add(each);
            }
        }
        System.out.println(list);
        System.out.println(newList);

    }

}