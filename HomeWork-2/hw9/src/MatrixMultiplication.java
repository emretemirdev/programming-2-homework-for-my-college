import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rowA = 3;
        int colA = 3;

        // Matris A'yı al
        double[][] matrixA = new double[rowA][colA];
        System.out.println("Matris A'nın elemanlarını giriniz:");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colA; j++) {
                matrixA[i][j] = input.nextDouble();
            }
        }

        // Matris B'nin boyutunu al
        System.out.print("Matris B'nin boyutunu giriniz (satır sütun): ");
        int rowB = 3;
        int colB = 3;

        // Matris B'yi al
        double[][] matrixB = new double[rowB][colB];
        System.out.println("Matris B'nin elemanlarını giriniz:");
        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < colB; j++) {
                matrixB[i][j] = input.nextDouble();
            }
        }

        // Matris çarpımını hesapla
        double[][] result = multiplyMatrix(matrixA, matrixB);

        // Sonucu ekrana yazdır
        System.out.println("Matris Çarpımı:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        int rowA = a.length;
        int colA = a[0].length;
        int rowB = b.length;
        int colB = b[0].length;

        if (colA != rowB) {
            throw new RuntimeException("Matrislerin boyutları uyumsuz");
        }

        double[][] c = new double[rowA][colB];

        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                for (int k = 0; k < colA; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return c;
    }
}