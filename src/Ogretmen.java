public class Ogretmen {

    /*
        Teacher Sınıfı Özellikleri :
        Nitelikler : name,mpno,branch
        Metotlar : Teacher()
     */

    String isim;
    String telNo;
    String brans;

    Ogretmen(String isim, String telNo, String brans)
    {
        this.isim = isim;
        this.telNo = telNo;
        this.brans = brans;
    }

    void yazdirOgretmen()
    {
        System.out.println("Adi : " + this.isim);
        System.out.println("Telefon Numarasi : " + this.telNo);
        System.out.println("Brans : " + this.brans);
    }
}
