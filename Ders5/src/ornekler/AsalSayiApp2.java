package ornekler;
//1'den 100 kadar olan asal sayiların bulunması
public class AsalSayiApp2 {
    public static void main(String[] args) {
        int i;
       int sayi ;

        String asalSayi="";
        String asalSayi2="";
        for( i=2;i<=100;i++){
            if(i!=2 || i!=3 || i!=5 || i!=7){
                if(i%2==0 || i%3==0 || i%5==0 || i%7==0){

                }
                else {
                    asalSayi+=i+" ";
                }
            }
            else{
                asalSayi2+=i+" ";

            }

         /*   int sayac=0;
            for(sayi=i;sayi>=1;sayi--){
                if(i%sayi==0){
                    sayac++;
                }
            }
            if(sayac==2){
                asalSayi+=i+" ";
            }*/

        }
        System.out.println(asalSayi2);


    }
}
