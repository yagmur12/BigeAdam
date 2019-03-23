package koleksiyonlar;

import java.util.Iterator;
import java.util.Vector;

public class VektorNesnesi {

    public static void main(String[] args) {
        Vector<String>renkler = new Vector<>();
        renkler.add("Kırmızı");
        renkler.add("Mavi");
        renkler.add("Yeşil");
        renkler.add("Turuncu");

        for(String renk :renkler){
            System.out.println(renk);
        }
        Iterator iterator = renkler.iterator();

        String temp;
        while(iterator.hasNext()){
            temp = (String) iterator.next();
            if(iterator.next().equals("Mavi")){
               iterator.remove();
               temp="";

            }
            System.out.println(temp);
            continue;

        }

    }
}
