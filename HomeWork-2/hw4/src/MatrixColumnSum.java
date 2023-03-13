import java.util.Scanner;

public class MatrixColumnSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];

        // Matrisin elemanlarını kullanıcıdan oku
        System.out.print("3x4 matrisin elemanlarını girin:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.println("Matris:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // Her sütunun toplamını hesapla ve ekrana yazdır
        for (int j = 0; j < matrix[0].length; j++) {
            double sum = sumColumn(matrix, j);
            System.out.print("Sütun " + j + " toplamı: " + sum);
        }
    }

    // Belirtilen sütunun toplamını hesapla
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
