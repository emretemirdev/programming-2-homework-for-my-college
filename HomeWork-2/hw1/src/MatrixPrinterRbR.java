import java.util.Random;
import java.util.Scanner;

public class MatrixPrinterRbR{

    public static void printMatrixRbR(int[][] m) {
        Random randomint = new Random();   // random sayı üretmek için
        for (int i = 0; i < m.length; i++) { // satır sayısı kadar döner
            for (int j = 0; j < m[i].length; j++) { // sütun sayısı kadar döner
                m[i][j] = randomint.nextInt(100); // 0 ile 99 arasında rastgele sayılar
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz: ");
        int row = input.nextInt(); // satır sayısını row değişkenine atar
        System.out.print("Sütun sayısını giriniz:");
        int column = input.nextInt(); // sütun sayısını column değişkenine atar
        int[][] matrix = new int[row][column];
        printMatrixRbR(matrix);
}
}
