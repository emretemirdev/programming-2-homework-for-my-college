public class Calisan extends Kisi {
    private String ofis;
    private double maas;
    private MyDate iseAlimTarihi;

    public Calisan(String ad, String adres, String telefon, String eposta, String ofis, double maas, MyDate iseAlimTarihi) {
        super(ad, adres, telefon, eposta); //super = parent class'ın constructor methodunu çağırır.
        this.ofis = ofis;
        this.maas = maas;
        this.iseAlimTarihi = iseAlimTarihi;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Ofis: " + ofis + "\n" +
                "Maaş: " + maas + "\n" +
                "İşe Alım Tarihi: " + iseAlimTarihi.toString();
    }
}