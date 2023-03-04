public class sumDigits{
    public static int sumDigits(int sayi) {
        int toplam = 0;
        while (sayi != 0)
        {
            toplam += sayi % 10; //sayının son basamağını toplama ekler
            sayi /= 10; //sayıyı 10'a bölerek son basamağı siler
        }
        return toplam;
    }

    public static void main(String[] args) {
        int sayi = 234;
        System.out.println("Girilen sayının basamakları toplamı: " + sumDigits(sayi));
    }
}
