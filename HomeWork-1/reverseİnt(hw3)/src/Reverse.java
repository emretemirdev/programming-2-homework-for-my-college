import java.util.Scanner;

public class Reverse{
//
    public static int reverse(int number) {
        int reversed = 0;
        //10 ile çarpmamızın nedeni, tersine çevirdiğimiz sayının basamaklarının yerini değiştirmek için kullanıyoruz.
        //Örneğin, 3456 sayısını tersine çevirmek istediğimizde, ilk olarak son basamağı olan 6'yı elde etmek istiyoruz.
        // Bunu yapmak için sayıyı 10'a bölüp modunu alarak son basamağı elde edebiliriz (3456 % 10 = 6).
        // Sonrasında 6'yı tersine çevirdiğimiz sayının son basamağı olarak eklemek için 10 ile çarpıyoruz.
        // 6 * 10 = 60. Bu şekilde 6'yı tersine çevirdiğimiz sayının son basamağı olarak ekledik.
        // Sonrasında 3456 sayısını 10'a bölüp, 345 sayısını elde ediyoruz.
        //Bu şekilde sayı bitene kadar işlemi tekrarlıyoruz.
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10; // number = number / 10
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir tam sayı girin: ");
        int number = input.nextInt();
        int reversed = reverse(number);
        System.out.println("Girilen sayının tersi: " + reversed);
    }
}
