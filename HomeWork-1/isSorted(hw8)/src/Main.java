public class Main {
    public static void main(String[] args) {
        int[] dizi1 = {1, 2, 3, 4, 5};
        System.out.println("Dizi 1 sıralı mı? " + isSorted(dizi1));
    }
    public static boolean isSorted(int[] dizi) {
        for (int i = 0; i < dizi.length - 1; i++)
        {
            if (dizi[i] > dizi[i+1])
            {
                return false;
            }
        }
        return true;
    }
}