package methotlar;

public class OrneklerApp {
    public static void main(String[] args) {

        helloMethod();
        sayiYaz(5);
        int sonuc =10+20;
        sayiYaz(sonuc);

        toplamaIslemi(5,8);
        int gelenDeger=donusTipiOlanToplamaIslemi(7,2);
        System.out.println("gelen değer:" +gelenDeger);

    }
      // return tipi omayan ve oarametre almayan method..
      //static olmasının sebebi static methdtan çağırabilmek için
    public static void helloMethod (){
        System.out.println("hello method..");
    }
     //Parametre alan dönüş tipi olmayan method
    public static void sayiYaz(int sayi){
        System.out.println("sayiniz" + sayi);
    }
    //Dönüş tipi olmayan iki parametre alan method
    public static void toplamaIslemi(int sayi1,int sayi2){
        int sonuc=sayi1+sayi2;
        System.out.println("toplama işlemi:"+sonuc);

    }

    public static int donusTipiOlanToplamaIslemi(int sayi1,int sayi2){
        int sonuc=sayi1+sayi2;
        return sonuc;
    }
}
