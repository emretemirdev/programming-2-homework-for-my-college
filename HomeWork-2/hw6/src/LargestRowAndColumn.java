import java.util.Random;

public class LargestRowAndColumn {
    public static void main(String[] args) {
        // Rastgele 0 ve 1'lerden oluşan 4x4 boyutlu bir matris oluşturma
        int[][] matrix = new int[4][4];
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(2);
            }
        }

        // Matrisi yazdırma
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        // En fazla 1 içeren ilk satırı bulma
        int maxRow = -1;
        int maxRowCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxRowCount) {
                maxRowCount = count;
                maxRow = i;
            }
        }

        // En fazla 1 içeren ilk sütunu bulma
        int maxCol = -1;
        int maxColCount = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxColCount) {
                maxColCount = count;
                maxCol = j;
            }
        }

        // Sonuçları yazdırma
        System.out.println("En fazla 1 içeren ilk satırın indeksi: " + maxRow);
        System.out.println("En fazla 1 içeren ilk sütunun indeksi: " + maxCol);
    }
}