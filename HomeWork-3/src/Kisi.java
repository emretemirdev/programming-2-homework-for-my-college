public class Kisi {
    private String ad;
    private String adres;
    private String telefon;
    private String eposta;
// private tipinde değişkenler oluşturuldu.
// private oluşturmamızın sebebi dışarıdan erişim engellenmesini sağlamaktır.

    public Kisi(String ad, String adres, String telefon, String eposta) // constructor oluşturuldu.
    {
        this.ad = ad;
        this.adres = adres;
        this.telefon = telefon;
        this.eposta = eposta;
    }

    @Override //override etmek: Java'da bir sınıfta bulunan bir metodu,
    // aynı isimde ve parametrelerde olmak üzere başka bir şekilde tanımlamak için kullanılır.
    public String toString() //toString () yöntemi, nesnenin özelliklerini bir metin dizisi olarak döndürür.
    {
        return "Ad: " + ad + "\n" +
                "Adres: " + adres + "\n" +
                "Telefon: " + telefon + "\n" +
                "E-posta: " + eposta;
    }
}