public class Fakulte extends Calisan {
    private String calismaSaatleri;
    private String rutbe;

    public Fakulte(String ad, String adres, String telefon, String eposta, String ofis, double maas, MyDate iseAlimTarihi,
                   String calismaSaatleri, String rutbe) {
        super(ad, adres, telefon, eposta, ofis, maas, iseAlimTarihi); //super = parent class'ın constructor methodunu çağırır.
        this.calismaSaatleri = calismaSaatleri;
        this.rutbe = rutbe;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Çalışma Saatleri: " + calismaSaatleri + "\n" +
                "Rütbe: " + rutbe;
    }
}