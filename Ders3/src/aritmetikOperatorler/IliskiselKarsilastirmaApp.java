package aritmetikOperatorler;

public class IliskiselKarsilastirmaApp {

    public static void main(String[] args) {
        int x=5 , y=10;

        // <,>,<=,>=,==,!=

        boolean sonuc1 =x<y;
        boolean sonuc2 =x>y;
        boolean sonuc3 =x==y;
        boolean sonuc4=x!=y;

        System.out.println("X in y den küçük olma durumu :"+sonuc1);
        System.out.println("X in y den büyük olma durumu :"+sonuc2);
        System.out.println("X in y e eşit olma durumu :"+sonuc3);
        System.out.println("X in y e eşit olmama durumu :"+sonuc4);
    }
}
