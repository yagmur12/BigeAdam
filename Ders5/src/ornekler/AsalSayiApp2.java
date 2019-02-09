package ornekler;
//1'den 100 kadar olan asal sayiların bulunması
public class AsalSayiApp2 {
    public static void main(String[] args) {
        int i;
       int sayi ;

        String asalSayi="";
        for( i=0;i<=100;i++){

            int sayac=0;
            for(sayi=i;sayi>=1;sayi--){
                if(i%sayi==0){
                    sayac++;
                }
            }
            if(sayac==2){
                asalSayi+=i+" ";
            }

        }
        System.out.println("1 den 100 e kadar olan asal sayilar:" + asalSayi);


    }
}
