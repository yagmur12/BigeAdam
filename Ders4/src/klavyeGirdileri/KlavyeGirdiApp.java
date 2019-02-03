package klavyeGirdileri;
import java.util.*;
public class KlavyeGirdiApp {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        //scanner.nextInt();
       // scanner.nex5tDouble();
       //scanner.next(); string değer okumak için
       //scanner.nextLine();String tüm değerleri okusun diye satırın boyutu kadar.
        int sayi1,sayi2,sonuc;
        System.out.print("Bir sayı giriniz:");
        sayi1=scanner.nextInt();
        System.out.println("Girdiğiniz sayi:"+sayi1);
        System.out.print("İkinci sayıyı giriniz:");
        sayi2=scanner.nextInt();
        System.out.println("Girdiğiniz ikinci sayi:"+sayi2);
        sonuc=sayi1+sayi2;
        System.out.println("Toplam sonuç:"+sonuc);

    }
}
