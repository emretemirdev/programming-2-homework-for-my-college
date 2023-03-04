import java.util.Scanner;

public class SifreKontrol {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean gecerli = false;

        while(!gecerli) //Yanlış şifre girildiği sürece döngü devam eder.
        {
            System.out.println("Şifreniz en az 8 karakterden oluşmalıdır, sadece harf ve sayılardan oluşmalıdır ve en az 2 sayı içermelidir.");
            System.out.print("Lütfen şifrenizi girin: ");
            String sifre = input.nextLine();

            gecerli = sifre.length() >= 8 && sifre.matches("[a-zA-Z0-9]+") && sifre.replaceAll("\\D", "").length() >= 2;

            //sifre.length() >= 8 şifrenin en az 8 karakter uzunluğunda olması gerektiğini belirtir.
            //sifre.matches("[a-zA-Z0-9]+") şifrenin sadece harf ve sayılardan oluştuğunu belirtir.
            //sifre.replaceAll("\\D", "").length() >= 2 şifrenin en az 2 sayı içermesi gerektiğini belirtir.
            //sifre.replaceAll("\\D", "") şifrenin içindeki sayıları alır.
            //sifre.replaceAll("\\D", "").length() >= 2 şifrenin içindeki sayıların sayısının 2 den büyük olması gerektiğini belirtir.

            if (gecerli) {
                System.out.println("Girilen şifre geçerli, Teşekkürler");
            } else {
                System.out.println("Girilen şifre geçersiz, Lütfen Yeniden Deneyin");
            }
        }
    }
}
