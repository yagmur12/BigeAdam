import java.util.Scanner;

public class ElseIfYapisiApp {

    public static void main(String[] args) {
        int sayi1 ,sayi2;
        Scanner c=new Scanner(System.in);

        System.out.print("Bir sayi giriniz:");
        sayi1 =c.nextInt();
        System.out.print("İkinci sayiyi giriniz:");
        sayi2=c.nextInt();

        if(sayi1>sayi2){
            System.out.println("sayi1 sayi2 den büyüktür");
        }
        else if(sayi1==sayi2){
            System.out.println("sayi1 sayi2 ye eşittir.");
        }
        else if(sayi1<10){
            System.out.println("sayi1 10 dan küçüktür.");
            if(sayi1==5){
                System.out.println("sayi1 5 e eşittir.");
            }
        }
        else{
            System.out.println("sayi1 sayi2 den küçüktür.");
        }
    }
}
