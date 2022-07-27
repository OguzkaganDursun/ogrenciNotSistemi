public class Kurs {

    /*
        Course Sınıfı Özellikleri :
        Nitelikler : name,code,prefix,note,Teacher
        Metotlar : Course() , addTeacher() , printTeacher()

        Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin.
        Sözlü notlarını da ortalamaya etkileme yüzdesi ile dahil edin.

        Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
        Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
     */

    Ogretmen kursOgretmeni;
    String dersAdi;
    String dersKodu;
    String dersOnAdi;
    int sinavNotu;
    int sozluNotu;

    Kurs(String dersAdi, String dersKodu, String dersOnAdi)
    {
        this.dersAdi = dersAdi;
        this.dersKodu = dersKodu;
        this.dersOnAdi = dersOnAdi;
        this.sinavNotu = 0;
        this.sozluNotu = 0;
    }

    void ogretmenEkle(Ogretmen kursOgretmeni)
    {
        if (kursOgretmeni.brans.equals(this.dersOnAdi))
        {
            this.kursOgretmeni = kursOgretmeni;
        }
        else
        {
            System.out.println("Ogretim Gorevlisi Ve Brans Uyusmuyor!\nOgretim Gorevlisi Bu Dersi Veremez!");
        }
    }

    void ogretmenBilgiYaz()
    {
        this.kursOgretmeni.yazdirOgretmen();
    }

}
