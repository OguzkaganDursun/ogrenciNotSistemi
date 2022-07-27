public class Ogrenci {

    /*
    Student Sınıfı Özellikleri :
    Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
    Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
     */

    Kurs k1;
    Kurs k2;
    Kurs k3;
    String ogrenciAdi;
    String ogrenciNo;
    String sinif;
    double k1Ort;
    double k2Ort;
    double k3Ort;
    double ortalama;
    boolean gectiMi;

    Ogrenci(String ogrenciAdi, String ogrenciNo, String sinif, Kurs k1, Kurs k2, Kurs k3)
    {
        this.ogrenciAdi = ogrenciAdi;
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
        this.k1 = k1;
        this.k2 = k2;
        this.k3 = k3;
        ortalamaHesapla();
        this.gectiMi = false;
    }

    void sinavNotuEkle(int k1Not, int k2Not, int k3Not)
    {
        if (k1Not >= 0 && k1Not <= 100)
        {
            this.k1.sinavNotu = k1Not;
        }

        if (k2Not >= 0 && k2Not <= 100)
        {
            this.k2.sinavNotu = k2Not;
        }

        if (k3Not >= 0 && k3Not <= 100)
        {
            this.k3.sinavNotu = k3Not;
        }
    }

    void sozluNotuEkle(int k1Sozlu, int k2Sozlu, int k3Sozlu)
    {
        if (k1Sozlu >= 0 && k1Sozlu <= 100)
        {
            this.k1.sozluNotu = k1Sozlu;
        }

        if (k2Sozlu >= 0 && k2Sozlu <= 100)
        {
            this.k2.sozluNotu = k2Sozlu;
        }

        if (k3Sozlu >= 0 && k3Sozlu <= 100)
        {
            this.k3.sozluNotu = k3Sozlu;
        }
    }

    void gectiMi()
    {
        System.out.println("=========================");
        this.gectiMi = gectiMiKontrol();
        notYaz();
        System.out.println("-------------------------");

        if (this.ortalama >= 55)
        {
            System.out.println("Tebrikler! \nSinifi Gecitiniz!");
            this.gectiMi = true;
        }
        else
        {
            System.out.println("Uzgunuz! \nSinifi Gecemediniz!");
            this.gectiMi = false;
        }
    }
    void notYaz()
    {


        System.out.println("Ogrenci Adi : " + this.ogrenciAdi);
        System.out.println("Ogrenci Numarasi : " + this.ogrenciNo);
        System.out.println("Sinifi : " + this.sinif);
        System.out.println(" ");
        System.out.println("Sozlu Notlari");
        System.out.println("Matematik : " + this.k1.sozluNotu);
        System.out.println("Fizik : " + this.k2.sozluNotu);
        System.out.println("Turkce : " + this.k3.sozluNotu);
        System.out.println(" ");
        System.out.println("Sinav Notlari");
        System.out.println("Matematik : " + this.k1.sinavNotu);
        System.out.println("Fizik : " + this.k2.sinavNotu);
        System.out.println("Turkce : " + this.k3.sinavNotu);

    }

    void ortalamaHesapla()
    {
        //Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
        //Her dersin sözlü notu %20, sınav notu %80 etkilidir.

        this.k1Ort = (this.k1.sozluNotu * 0.20) + (this.k1.sinavNotu * 0.80);
        this.k2Ort = (this.k2.sozluNotu * 0.20) + (this.k2.sinavNotu * 0.80);
        this.k3Ort = (this.k3.sozluNotu * 0.20) + (this.k3.sinavNotu * 0.80);

        this.ortalama = (this.k1Ort + this.k2Ort + this.k3Ort) / 3.0;
    }

    public boolean gectiMiKontrol()
    {
        ortalamaHesapla();
        return this.ortalama >= 55;
    }
    
}
