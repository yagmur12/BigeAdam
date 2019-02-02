package aritmetikOperatorler;

public class AritmatikApp {
    public static void main (String [] args){

 //Değişken isimleri farklı olmalıdır.
        int x=7 , b=3 ,c=13 ,d ,sonuc;
        double  bolmesonuc ;

        double a = (double) x;
        double y =(double) b;



        sonuc=x+b;
        System.out.println("Toplama işlemi sonucu :"+sonuc);

        sonuc=x-b;
        System.out.println("Çıkarma işlemi sonucu :"+sonuc);


        sonuc=x*b;
        System.out.println("Çarpma işlemi sonucu :"+sonuc);

        bolmesonuc =x/y;
        System.out.println("bölme işlemi sonucu :"+bolmesonuc);

        bolmesonuc =a/b;
        System.out.println("bölme işlemi sonucu :"+bolmesonuc);


        sonuc=x%b;
        System.out.println("Mod işlemi sonucu :"+sonuc);


    }
}
