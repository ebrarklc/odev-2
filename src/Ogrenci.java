public class Ogrenci {
    private  String ad;
    private  String bolum;
    private double gano;
    private  int girisYili;
    private int bolumKodu;
    private String ogrNo;
    private String girisSiraNo;
    private int dersSayisi;
    private int uzatmaYili;



    public Ogrenci(String ad,String bolum, double gano, int girisYili, int bolumKodu,String girisSiraNo,int dersSayisi,int uzatmaYili) {
        this.ad = ad;
        this.bolum = bolum;
        this.gano = gano;
        this.girisYili = girisYili;
        this.bolumKodu = bolumKodu;
        this.ogrNo=hesaplaOgrenciNo(girisYili,bolumKodu,girisSiraNo);
        this.girisSiraNo=girisSiraNo;
        this.dersSayisi=dersSayisi;
        this.uzatmaYili=uzatmaYili;
    }
    public Ogrenci(String ad,String bolum,String girisSiraNo){
        this.ad=ad;
        this.bolum=bolum;
        this.girisSiraNo=girisSiraNo;
        this.gano=0.0;
        this.girisYili=0;
        this.bolumKodu=0;
        this.dersSayisi=0;
        this.uzatmaYili=0;
        this.ogrNo=hesaplaOgrenciNo(girisYili,bolumKodu,girisSiraNo);
    }

    public String getAd() {
        return ad;
    }


    public String getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGirisSiraNo() {
        return girisSiraNo;
    }

    public void setGirisSiraNo(String girisSiraNo) {
        this.girisSiraNo = girisSiraNo;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public int getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(int bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    public int getDersSayisi() {
        return dersSayisi;
    }

    public void setDersSayisi(int dersSayisi) {
        this.dersSayisi = dersSayisi;
    }

    public int getUzatmaYili() {
        return uzatmaYili;
    }

    public void setUzatmaYili(int uzatmaYili) {
        this.uzatmaYili = uzatmaYili;
    }

    public void ganoKontrol(double gano){
        if(0.0 > gano || 4.0< gano){
            throw new IllegalArgumentException("Ganosu 0-4 aralıgında degil");
        }
    }
    public String hesaplaOgrenciNo(int girisYili,int bolumKodu,String girisSiraNo){
        return ""+girisYili+bolumKodu+girisSiraNo;
    }
    public double harcHesapla(int dersSayisi,int uzatmaYili){
        double harc=(dersSayisi*100)+(uzatmaYili*80);
        return harc;
    }
    public double harcHesapla(int dersSayisi){
        double harc2= dersSayisi*100;
        return harc2;
    }
}
