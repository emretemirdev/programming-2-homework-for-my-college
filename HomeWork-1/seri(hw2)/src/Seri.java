import java.util.Scanner;

public class Seri {
    public static void main(String[] args) {
        double sum = 0;
        System.out.printf("%-10s%-10s%-10s\n", "Sayı", "Değer", "Toplam"); // Tablo oluşturmak için %s kullanıldı.
        // %-10 ile 10 karakterlik alan oluşturuldu. Sayılar sola yaslandı.
        for (int i = 1; i <= 20; i++)
        {
            sum += (double) i / (i + 1);
            System.out.printf("%-10d%-10.5f%-10.5f\n", i, (double) i / (i + 1), sum);
            // %-10 ile 10 karakterlik alan oluşturuldu. Sayılar sola yaslandı.
            // %f ile double değerler yazdırıldı. 5 karakterlik alan oluşturuldu.
            // %D ile int değerler yazdırıldı. 10 karakterlik alan oluşturuldu.
            // .5 ile ondalık sayıların virgülden sonra 5 basamağını yazdırmak için kullanılır.
        }
    }
}


