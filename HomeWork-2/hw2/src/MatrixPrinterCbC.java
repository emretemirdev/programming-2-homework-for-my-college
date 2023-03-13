import java.util.Random;
import java.util.Scanner;
public class MatrixPrinterCbC{

    public static void printMatrixCbC(int[][] m) {
        Random rand = new Random();
        for (int i = 0; i < m[0].length; i++) { // sütun sayısı kadar döner
            for (int j = 0; j < m.length; j++) { // satır sayısı kadar döner
                m[j][i] = rand.nextInt(100); // 0 ile 99 arasında rastgele sayılar
                System.out.print(m[j][i] + " ");
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
        printMatrixCbC(matrix);
    }
}
