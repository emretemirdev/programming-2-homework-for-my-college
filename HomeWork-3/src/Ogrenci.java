public class Ogrenci extends Kisi {
    private static final String STATUS = "Öğrenci"; //final = sabit demek. Değer değişmeyecek.

    private String sinif;

    public Ogrenci(String ad, String adres, String telefon, String eposta, String sinif) //constructor method
    {
        super(ad, adres, telefon, eposta); //super = parent class'ın constructor methodunu çağırır.
        this.sinif = sinif; //this = class'ın kendisini ifade eder.
    }

    @Override //override method
    public String toString() //toString methodu = class'ın içindeki değerleri string olarak döndürür.
    {
        return super.toString() + "\n" +
                "Statü: " + STATUS + "\n" +
                "Sınıf: " + sinif;
    }
}