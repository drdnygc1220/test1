package SsgCOLLECTION;

import java.util.HashSet;
import java.util.TreeSet;

public class CO2Set {
    public static void main(String[] args) {
        HashSet<Integer>set1=new HashSet<>();//integer da random ataması yapmadı..

        set1.add(1);
        set1.add(4);
        set1.add(2);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println(set1);

        TreeSet<String>set2=new TreeSet<>();
        set2.add("sinan");
        set2.add("kerem");
        set2.add("onur");
        set2.add("tuba");
        System.out.println(set2);//random atıyor..
    }
}
