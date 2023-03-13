import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = 3 ;
        int columns = 3;

        // İlk matrisi girin
        System.out.printf("İlk %d x %d matrisi girin: %n", rows, columns);
        double[][] matrix1 = new double[rows][columns];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }

        // İkinci matrisi girin
        System.out.printf("İkinci %d x %d matrisi girin: %n", rows, columns);
        double[][] matrix2 = new double[rows][columns];
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }

        // Matrisleri toplayın
        double[][] sum = addMatrix(matrix1, matrix2);

        // Matrisleri yazdırın
        System.out.printf("Matrislerin toplamı %d x %d: %n", rows, columns);
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] sum = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
}