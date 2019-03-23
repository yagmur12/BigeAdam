package koleksiyonlar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListNesnesi {
    public static void main(String[] args) {

        List<String> sayilar =new LinkedList<>();

        sayilar.add("1");
        sayilar.add("2");
        sayilar.add("3");
        sayilar.add("4");

        ((LinkedList<String>) sayilar).addFirst("0");
        ((LinkedList<String>) sayilar).addLast("5");


        for(String sayi :sayilar){
            System.out.println(sayi);
        }

        System.out.println("Sondaki eleman silindi" + ((LinkedList<String>) sayilar).removeLast());
        Iterator iterator1 =sayilar.iterator();
        Iterator iterator =((LinkedList<String>) sayilar).descendingIterator();
        System.out.println("Tersten yazdırılıyor...");

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Prevois kullanarak yazdırma");
        Iterator iterator3 = (Iterator) sayilar.listIterator();

        while(((ListIterator) iterator3).hasPrevious()){
            System.out.println();
        }
    }
}
