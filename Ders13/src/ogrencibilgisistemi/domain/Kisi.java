package ogrencibilgisistemi.domain;
public abstract class Kisi {
    private String adi;
    private String soyAdi;
    private String tcNo;
    private String cinsiyet;
    private String dogumTarihi;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyAdi() {
        return soyAdi;
    }

    public void setSoyAdi(String soyAdi) {
        this.soyAdi = soyAdi;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "adi='" + adi + '\'' +
                ", soyAdi='" + soyAdi + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                '}';
    }
}

