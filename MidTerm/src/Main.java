import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        playGame();
    }
    public static void playGame() {
        // Başlangıç gridini oluştur
        String[][] grid = new String[3][3]; //2 boyutlu dizi oluşturduk
        for (int i = 0; i < 3; i++) {//döngü ile 2 boyutlu dizinin içini X ile doldurduk
            for (int j = 0; j < 3; j++) {
                grid[i][j] = "X";
            }
        }
        printGrid(grid);
        String baslangic = "UPCHPBCBC"; //nesnelerin başlangıç konumlarını belirledik
        MyObj[] objects = new MyObj[9]; //MyObj tipinde 9 elemanlı bir dizi oluşturduk.
        //MyObj tipi bir arabirimdir ve bu arabirimin uygulandığı sınıfların referanslarını
        // tutan bir dizi oluşturduk.
        //Bu dizi içindeki nesnelerin whoAmI() metodu ile nesnelerin kendilerini tanımlayan
        // karakterlerini döndürürler.
        for (int i = 0; i < 9; i++) {
            switch (baslangic.charAt(i)) {
                //charAt() metodu, bir String'deki belirli bir pozisyondaki karakteri döndürür.
                // String'in ilk karakteri 0 indeksli olduğu için, pozisyon 0'dan başlar
                // ve length()-1 değerine kadar gider.
                case 'C':
                    objects[i] = new Cup(); // C karakteri için bir Cup nesnesi ekleniyor
                    break;
                case 'P':
                    objects[i] = new Pen(); //  P karakteri için bir pen nesnesi ekleniyor
                    break;
                case 'H':
                    objects[i] = new Hat(); // H karakteri için bir hat nesnesi ekleniyor
                    break;
                case 'B':
                    objects[i] = new Ball(); // B karakteri için bir ball nesnesi ekleniyor
                    break;
                case 'U': // bu değeri döndüren bir sınıf yok,
                    // bu nedenle MyObj arabirimini uygulayan anonim bir sınıf oluşturuluyor.
                    // Bu anonim sınıf, whoAmI() metodunu ezerek "U" değerini döndürüyor.
                    // Bu sayede, listede U karakterine sahip bir eleman olduğunda,
                    // objects[i] ifadesi "U" değerini döndüren bir nesne olacak şekilde ayarlanıyor.
                    objects[i] = new MyObj() {
                        @Override
                        public String whoAmI() {
                            return "U";
                        }
                    };
                    break;
            }
        }

        Scanner scanner = new Scanner(System.in);
        // 9 kez kullanıcıdan konum seçmesini iste
        for (int i = 0; i < 9; i++) {
            System.out.println("Görmek istediğiniz satır-sütunu girin (örn: 1 2)");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // Seçilen konumun nesne referansını bul
            MyObj obj = objects[row * 3 + col]; // 3x3'lük bir matris olduğu için
            //satır değerini 3 ile çarpıp sütun değerini ekliyoruz.
            //örn: 1 2 girildiğinde 1*3+2=5 oluyor ve 5. elemanı seçiyoruz.

            // Seçilen konumu güncelle
            grid[row][col] = obj.whoAmI();
            //grid[row][col] = objects[row * 3 + col].whoAmI(); bu şekilde de yazılabilir.
            //konumun nesne referansını bulup whoAmI() metodu ile nesnenin kendisini tanımlayan
            // karakteri döndürüyoruz.

            // Güncellenmiş gridi ekrana yazdır
            printGrid(grid);
        }
        // Tekrar örtmek isteyip istemediğini sor
        System.out.println("Tüm hücreleri tekrar örtüp oyuna başlamak istiyor musunuz? (E/H)");
        String answer = scanner.next();
        if (answer.equals("E") || answer.equals("e")) { //kullanıcı E veya e girerse
            // Başlangıç gridini tekrar göster
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    grid[i][j] = "X";
                }
            }
            printGrid(grid);
            System.out.println("Tüm hücreleri tahmin etmeye başlayabilirsin");
        }
        else {
            System.out.println("Oyun bitti.");
        }
        // Tüm hücreler açıklandıktan sonra nesnelerin yerlerini göster
        System.out.println("Lütfen nesnelerin sırasını girin:");
        String guess = scanner.next();
        int correctGuesses = 0; //kullanıcının doğru tahmin sayısını tutmak için
        for (int i = 0; i < 9; i++) {
            if (guess.charAt(i) == baslangic.charAt(i)) { //charAt metodu stringlerin
                // karakterlerine erişmemizi sağlar ve index numarası ile erişiriz.
                // eğer kullanıcının girdiği karakterler ile başlangıç karakterleri aynıysa
                // doğru tahmin sayısını 1 arttır.

                correctGuesses++;
            }
        }
        if (correctGuesses >= 4) {
            System.out.println("Tebrikler " + correctGuesses + " tane bilip " + "kazandınız!");
        } else {
            System.out.println("Maalesef " + correctGuesses + " tane bilip " + "kaybettiniz");
        }
    }
    public static void printGrid(String[][] grid) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
