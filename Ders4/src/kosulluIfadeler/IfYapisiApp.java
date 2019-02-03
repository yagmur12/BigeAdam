package kosulluIfadeler;

import java.util.Scanner;

public class IfYapisiApp {

    public static void main(String[] args) {
      /*  int a=5;
        if(a==5){
            System.out.println("a değişkeni 5 e eşittir");
        }
        System.out.println("byeeee....");*/

        Scanner b =new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= b.nextInt();
        if(sayi<10){
            System.out.println("sayi 10 dan küçüktür");
        }
        if(sayi>10){
            System.out.println("sayi 10 dan büyük");
        }
    }
}
