import java.util.Scanner;

public class ConsecutiveFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan matris boyutlarını alın
        System.out.print("Matrisin satır sayısını girin: ");
        int rows = input.nextInt();
        System.out.print("Matrisin sütun sayısını girin: ");
        int cols = input.nextInt();

        // Matrisi oluşturun ve kullanıcıdan değerleri alın
        int[][] matrix = new int[rows][cols];
        System.out.println("Matrisin elemanlarını girin:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Matrisin ardışık dört eşit sayı içerip içermediğini kontrol edin
        boolean hasConsecutiveFour = isConsecutiveFour(matrix);

        // Sonucu yazdırın
        if (hasConsecutiveFour) {
            System.out.println("Matris ardışık dört eşit sayı içeriyor.");
        } else {
            System.out.println("Matris ardışık dört eşit sayı içermiyor.");
        }
    }

    public static boolean isConsecutiveFour(int[][] values) {
        // Satırlarda ardışık dört sayı kontrolü
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length - 3; j++) {
                if (values[i][j] == values[i][j + 1] &&
                        values[i][j] == values[i][j + 2] &&
                        values[i][j] == values[i][j + 3]) {
                    return true;
                }
            }
        }

        // Sütunlarda ardışık dört sayı kontrolü
        for (int j = 0; j < values[0].length; j++) {
            for (int i = 0; i < values.length - 3; i++) {
                if (values[i][j] == values[i + 1][j] &&
                        values[i][j] == values[i + 2][j] &&
                        values[i][j] == values[i + 3][j]) {
                    return true;
                }
            }
        }

        // Ardışık dört sayı yoksa false döndürün
        return false;
    }
}
