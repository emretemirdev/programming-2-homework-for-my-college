import java.util.Scanner;

public class MergeSortedLists{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // İlk sıralı listeyi kullanıcıdan oku
        System.out.print("Birinci sıralı listeyi girin (eleman sayısı ve elemanlar ayrı satırlarda): ");
        int n1 = input.nextInt();
        int[] list1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            list1[i] = input.nextInt();
        }

        // İkinci sıralı listeyi kullanıcıdan oku
        System.out.print("İkinci sıralı listeyi girin (eleman sayısı ve elemanlar ayrı satırlarda): ");
        int n2 = input.nextInt();
        int[] list2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            list2[i] = input.nextInt();
        }

        // İki listeyi birleştir
        int[] mergedList = merge(list1, list2);

        // Birleştirilmiş listeyi yazdır
        System.out.print("Birleştirilmiş sıralı liste: ");
        for (int i = 0; i < mergedList.length; i++) {
            System.out.print(mergedList[i] + " ");
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];
        int i = 0, j = 0, k = 0;
        while (i < list1.length && j < list2.length) { // i ve j listelerin uzunluğunu geçmeyecek şekilde artacak
            if (list1[i] < list2[j]) {
                mergedList[k++] = list1[i++]; // k ve i birer birer artacak ve mergedList'in sonuna eklenecek
            } else {
                mergedList[k++] = list2[j++]; // k ve j birer birer artacak ve mergedList'in sonuna eklenecek
            }
        }
        while (i < list1.length) {
            mergedList[k++] = list1[i++];
        }
        while (j < list2.length) {
            mergedList[k++] = list2[j++];
        }
        return mergedList;
    }
}
