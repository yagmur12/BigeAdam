package ogrencibilgisistemi.domain;

import ogrencibilgisistemi.dersler.Ders;

import java.util.ArrayList;

public class Ogrenci extends Kisi {
    private Long okulNumarasi;
    private Integer dersSayisi;
    private double notOrtalamasi;
    private ArrayList<Ders>dersListesi;
    private boolean dersDurumu;
    public  Ogrenci(){

    }
    public Ogrenci (Long okulNumarasi,double notOrtalamasi,Integer dersSayisi){
        this.okulNumarasi=okulNumarasi;
        this.notOrtalamasi=notOrtalamasi;
        this.dersSayisi=dersSayisi;

    }

    public ArrayList<Ders> getDersListesi() {
        return dersListesi;
    }

    public boolean isDersDurumu() {
        return dersDurumu;
    }

    public void setDersDurumu(boolean dersDurumu) {
        this.dersDurumu = dersDurumu;
    }

    public void setDersListesi(ArrayList<Ders> dersListesi) {
        this.dersListesi = dersListesi;
    }

    public Long getOkulNumarasi() {
        return okulNumarasi;
    }

    public void setOkulNumarasi(Long okulNumarasi) {
        this.okulNumarasi = okulNumarasi;
    }

    public Integer getDersSayisi() {
        return dersSayisi;
    }

    public void setDersSayisi(Integer dersSayisi) {
        this.dersSayisi = dersSayisi;
    }

    public double getNotOrtalamasi() {
        return notOrtalamasi;
    }

    public void setNotOrtalamasi(double notOrtalamasi) {
        this.notOrtalamasi = notOrtalamasi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "okulNumarasi=" + okulNumarasi +
                ", dersSayisi=" + dersSayisi +
                ", notOrtalamasi=" + notOrtalamasi +
                ", dersListesi=" + dersListesi +
                ", dersDurumu=" + dersDurumu +
                "} " + super.toString();
    }
}
