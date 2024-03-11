public class Main {
    public static void main(String[] args) {
        Ogrenci[] students={
                new Ogrenci(null,null,0.0,1973,104,"121",0,0),
                new Ogrenci("Gokan","Bilgisayar Mühendisligi",0.0,1985,104,"001",0,0),
                new Ogrenci("Ayse","Makine Müh.",0.0,1985,104,"001",4,1),
                new Ogrenci("Elif","Elektrik-Elektronik Müh.",1.98,2020,104,"001",8,2)
        };
        System.out.println("Ogrenci Bilgileri");
        for (int i=0;i< students.length;i++){
            System.out.println("OGR-"+(i+1)+" "+students[i].getAd()+ " "+students[i].getBolum()+" "+students[i].getOgrNo()+" "+students[i].getGano());
        }

        for (int i = 2; i < students.length; i++) {
            System.out.println( (i+1) +".Ogrencinin odeyecegi Harc: " +students[i].harcHesapla(students[i].getDersSayisi(),students[i].getUzatmaYili()));
        }

        for (int i=0;i< students.length;i++){
            try{
                students[i].ganoKontrol(students[i].getGano());

            }catch (IllegalArgumentException e){
                System.out.println("HATA:"+(i+1)+".ogrencinin "+e.getMessage());
            }
        }
    }
}
