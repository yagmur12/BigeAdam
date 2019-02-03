import java.util.Scanner;

public class IfThenElse {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int x=t.nextInt();

        String cevap=(x>5)?"girilen ifade 5 ten büyüktür":"girilen ifade 5 ten küçüktür";
        /*String cevap2=(x==5)?"girilen değer 5 e eşittir":"eşit değildir";*/
        System.out.println(cevap);
        /*System.out.println(cevap2);*/

    }
}
