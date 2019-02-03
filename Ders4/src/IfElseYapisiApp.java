import java.util.Scanner;

public class IfElseYapisiApp {

    public static void main(String[] args) {

        Scanner x =new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        double y =x.nextDouble();
        System.out.println("ikinci sayiyi giriniz");
        double b=x.nextDouble();


        if(y>b){
            System.out.println("sayi bir sayi ikiden büyüktür.");
        }
        else if(y<b){
            System.out.println("sayi bir sayi ikiden küçüktür.");

        }
        else {
            System.out.println("sayi bir sayi ikiye eşittir");
        }
    }
}
