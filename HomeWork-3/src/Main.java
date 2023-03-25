public class Main {
    public static void main(String[] args) {
            // Kişi sınıfından örnek oluşturma
            Kisi kisi = new Kisi("Ali", "İstanbul", "555-5555", "ali@ornek.com");
            System.out.println("Kişi:\n" + kisi);

            // Öğrenci sınıfından örnek oluşturma
            Ogrenci ogrenci = new Ogrenci("Ayşe", "Ankara", "444-4444", "ayse@ornek.com", "Bilgisayar Mühendisliği");
            System.out.println("\nÖğrenci:\n" + ogrenci);

            // Çalışan sınıfından örnek oluşturma
            MyDate iseAlimTarihi = new MyDate(2021, 1, 1);
            Calisan calisan = new Calisan("Mehmet", "İzmir", "666-6666", "mehmet@ornek.com", "A-101", 5000, iseAlimTarihi);
            System.out.println("\nÇalışan:\n" + calisan);

            // Fakülte sınıfından örnek oluşturma
            Fakulte fakulte = new Fakulte("Can", "Bursa", "777-7777", "can@ornek.com", "B-102", 7000, iseAlimTarihi, "8-16", "Doçent");
            System.out.println("\nFakülte:\n" + fakulte);

            // Personel sınıfından örnek oluşturma
            Personel personel = new Personel("Seda", "İzmir", "888-8888", "seda@ornek.com", "C-201", 4000, iseAlimTarihi, "İdari İşler Sorumlusu");
            System.out.println("\nPersonel:\n" + personel);
        }
}