package ogrencibilgisistemi;

import ogrencibilgisistemi.dersler.Ders;
import ogrencibilgisistemi.dersler.Fizik;
import ogrencibilgisistemi.dersler.Matematik;
import ogrencibilgisistemi.domain.Ogrenci;
import ogrencibilgisistemi.service.BaseBilgiSistemiArayuz;
import ogrencibilgisistemi.service.BilgiSistemi;
import ogrencibilgisistemi.service.BilgiSistemiArayuz;

import java.util.ArrayList;

public class StartApp {
    public static void main(String[] args) {

        BilgiSistemiArayuz bilgisistemi= new BilgiSistemi();

        Ders matematik =new Matematik();

        matematik.setDersAdi("Matematik");
        matematik.setKatSayisi(3.0);
        matematik.setPuan(50.0);


        Ders fizik =new Fizik();
        fizik.setDersAdi("Fizik");
        fizik.setPuan(20.0);
        fizik.setKatSayisi(2.0);

        bilgisistemi.dersKaydet(matematik);
        bilgisistemi.dersKaydet(fizik);

        Ogrenci ogrenci =new Ogrenci();
        ogrenci.setAdi("Ali");
        ogrenci.setSoyAdi("YILMAZ");
        ogrenci.setCinsiyet("Erkek");
        ogrenci.setDogumTarihi("01/01/1989");
        ogrenci.setTcNo("45571857609");
        ogrenci.setDersSayisi(2);
        ogrenci.setOkulNumarasi(536L);
        ArrayList<Ders>aldigiDersler=bilgisistemi.dersListesiGetir();
        ogrenci.setDersListesi(aldigiDersler);


        double notOrtalamasi=bilgisistemi.notHesapla(ogrenci);

        ogrenci.setNotOrtalamasi(notOrtalamasi);

        System.out.println("Ogrencinin not hesaplaması : " +ogrenci.getNotOrtalamasi());

        boolean sinifGecmeDurumu=bilgisistemi.derDurumunaBak(ogrenci);
        ogrenci.setDersDurumu(sinifGecmeDurumu);
        System.out.println("Ogrencinin sınıf geçme durumu : " +ogrenci.isDersDurumu());

        bilgisistemi.ogrenciKaydet(ogrenci);

        ArrayList<Ogrenci> ogrenciListesi =bilgisistemi.ogrenciListesiGetir();
        ArrayList<Ders> dersListesi =bilgisistemi.dersListesiGetir();

        System.out.println("Ogrenci Ders Listesi :");
        bilgisistemi.dersLisstesiYaz(dersListesi);

        System.out.println("Ogrenci Listesi :");
        bilgisistemi.ogrenciListesiYaz(ogrenciListesi);

    }
}
