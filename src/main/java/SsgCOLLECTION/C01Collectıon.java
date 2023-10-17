package SsgCOLLECTION;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01Collectıon {
    //nesne toplulugu
    //set(kume)=bir degerden sadece bir tane olmalı.
    // queue(sıra)=ilk giren ilk cıkıyor
    // linkedSet(baglı)=halay;iki eleman ayrılır araya girer
    // treeSet(dogalsıralı)=asgi degere göre sıralar..
    // hashSet=rastgele atıyor..deque=iki taraftan sıralar hem baştan hem sondan
    public static void main(String[] args) {
        //linked list oluşturma..
        LinkedList<Integer>list1=new LinkedList<>();
        List<Integer>list2=new LinkedList<>();
        Deque<Integer> list3=new LinkedList<>();
        Queue<Integer> list4=new LinkedList<>();
        //İMPLEMENTS kullanırsak override etmek zorundayız..

        //list yaptıgımızda silme ve ekleme
        list2.add(1); list2.add(2); list2.add(3); list2.add(4); list2.add(5);
        list2.add(2,6);//istediğimiz indexe istediğimiz elementi ekliyoruz..
        System.out.println(list2);
        list2.remove(2);//BURADA İNDEXİNİ SİLER..
        System.out.println(list2);
        list2.remove((Object)2);//BURADA 2 DEGERİNİ SİLER
        System.out.println(list2);

        //Queue yaptıgımızdaa silme ve ekleme farklı olur..
        list4.add(1);//sırada kaynak yasak
        list4.add(2);
        list4.add(3);
        list4.add(4);
        list4.add(5);
        System.out.println(list4);
        list4.remove();//en baştan silmeye başlar..
        System.out.println(list4);

        //Deque yaptıgımızda ekleme ve cıkarma..cift yön var..
        list3.add(1);
        list3.addFirst(2);//başa ekliyorum bu methodla
        list3.add(3);
        list3.add(4);
        list3.add(5);
        System.out.println(list3);
        list3.removeFirst();//baştaki eleman silinir..
        list3.removeLast();//sondaki eleman silinir
        System.out.println(list3);

        //linkedList ekleme cıkarma yapıyoruz..
        list1.add(2);//limkedList ve deque den geldi...
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(0,1);//bu listin özelliğinden geldi...
        list1.addFirst(0);//bu deque den geldi...
        System.out.println(list1);;
        list1.remove();//deque özelliği
        System.out.println(list1);
        list1.remove();//list özelliği
        System.out.println(list1);
    }
}
