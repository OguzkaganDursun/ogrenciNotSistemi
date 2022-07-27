public class Main {
    public static void main(String[] args) {

        Ogretmen ogr1 = new Ogretmen("Oguzkagan", "11112223344","MAT");
        Ogretmen ogr2 = new Ogretmen("Elif","01472589966","FZK");
        Ogretmen ogr3 = new Ogretmen("Busra", "99998887766","TRK");

        Kurs matematik = new Kurs("Matematik", "101", "MAT");
        matematik.ogretmenEkle(ogr1);

        Kurs fizik = new Kurs("Fizik", "102","FZK");
        fizik.ogretmenEkle(ogr2);

        Kurs turkce = new Kurs("Turkce","103","TRK");
        turkce.ogretmenEkle(ogr3);


        Ogrenci ogrenci1 = new Ogrenci("Alex","956485661188","PC-MUH",matematik, fizik, turkce);
        ogrenci1.sinavNotuEkle(90,75,60);
        ogrenci1.sozluNotuEkle(100,100,75);
        ogrenci1.gectiMi();

        Ogrenci ogrenci2 = new Ogrenci("Hagi","105895483257","YAZ-MUH",matematik, fizik, turkce);
        ogrenci2.sinavNotuEkle(65,60,25);
        ogrenci2.sozluNotuEkle(45,35,75);
        ogrenci2.gectiMi();

        Ogrenci ogrenci3 = new Ogrenci("Aykut","846157546113","KIMYA-MUH",matematik, fizik, turkce);
        ogrenci3.sinavNotuEkle(10,10,0);
        ogrenci3.sozluNotuEkle(100,70,75);
        ogrenci3.gectiMi();

        Ogrenci ogrenci4 = new Ogrenci("Ridvan","100354687423","MAT-MUH",matematik, fizik, turkce);
        ogrenci4.sinavNotuEkle(100,95,85);
        ogrenci4.sozluNotuEkle(100,100,75);
        ogrenci4.gectiMi();
    }
}
