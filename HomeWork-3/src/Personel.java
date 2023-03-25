public class Personel extends Calisan {
    private String unvan;

    public Personel(String ad, String adres, String telefon, String eposta, String ofis, double maas, MyDate iseAlimTarihi,
                    String unvan) {
        super(ad, adres, telefon, eposta, ofis, maas, iseAlimTarihi);
        this.unvan = unvan;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Ünvan: " + unvan;
    }
}