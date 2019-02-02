package aritmetikOperatorler;

public class AritmetikArttirimApp {
    public static void main(String [] args){
        int a=2 ,b=7 , c=40 ,d=50;
        a++;// Değişkeni ata sonra arttır,
        System.out.println("a:"+a);

        ++b; //Değikeni arttır sonra ata;
        System.out.println("b:"+b);

        c--;// değikeni ata sonra azalt;
        System.out.println("c:"+c);

        --d;//değişkeni azalt sonra ata;
        System.out.println("d:"+d);


        int x=7, y=7,sonuc1,sonuc2;
        sonuc1=++x;
        sonuc2=y++;
        System.out.println("sonuc1::"+sonuc1 +"   " +"sonuc2::"+sonuc2);
        System.out.println("y değeri"+y);
    }
}