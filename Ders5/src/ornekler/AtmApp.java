package ornekler;



import java.util.Scanner;

public class AtmApp {
    public static void main(String[] args) {
        int secenek =0;
        String sifre="1234";
        String girilenSifre="";
        int bakiye=1_000_000;//java 7 ile gelen özellik
        int cekilecekMiktar=0;
        boolean devamEdilsinMi=false;
        Scanner x = new Scanner(System.in);

        do {
            System.out.println("Hoşgeldiniz");
            System.out.println("Şİfrenizi girin");
            girilenSifre = x.next();
            if (girilenSifre.equals(sifre)) {

                System.out.println("Hangi işlemi yapmak istiyorsunuz");
                System.out.println("1-)Para Çekme");
                System.out.println("0-)Çıkış");
                System.out.println("Seçiniz");
                secenek=x.nextInt();

                if(secenek>=0 && secenek<=1) {
                    switch (secenek) {
                        case 0:
                            System.out.println("yine bekleriz");
                            devamEdilsinMi =false;
                            break;
                        case 1:
                            System.out.print("Çekmek istenilen miktarı giriniz");
                            cekilecekMiktar=x.nextInt();
                            if(cekilecekMiktar>bakiye){
                                System.out.println("Yetersiz bakiye..");
                                devamEdilsinMi=false;
                            }
                            else{
                                bakiye=bakiye-cekilecekMiktar;
                                System.out.println("Önce kartınızı sonra paranızı alınızı");
                                System.out.println("Çekilen miktar"+cekilecekMiktar);
                                System.out.println("Kalan miktar"+bakiye+"TL");
                                devamEdilsinMi=true;
                            }

                    }
                } else{
                    System.out.println("Yanlış seçenek");
                }
            } else {
                System.out.println("Yanlış şifre girdiniz!");
            }
        }  while (devamEdilsinMi);



    }
}
