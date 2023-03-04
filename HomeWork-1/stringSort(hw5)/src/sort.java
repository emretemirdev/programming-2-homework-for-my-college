import java.util.Arrays; // Arrays.sort() metodu için
import java.util.Scanner;

public class sort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = input.nextLine();

        String siralanmisKelime = sort(kelime); // sort() metodu çağrılır
        System.out.println("Sıralanmış kelime: " + siralanmisKelime);
    }

    public static String sort(String s) {
        char[] charArray = s.toCharArray(); // String'i char dizisine çevirir
        Arrays.sort(charArray); // Arrays.sort() metodu char dizisini sıralar
        //sort metodu şöyle çalışır: ilk önce char dizisini String'e çevirir, sonra String'i sıralar ve son olarak String'i char dizisine çevirir.
        return new String(charArray);
    }
}
