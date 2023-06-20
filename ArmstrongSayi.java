import java.util.Scanner;
public class ArmstrongSayi {
    public static void main(String[] args) {
        int sayi, basamak = 0, result = 0;
        System.out.println("Bir sayı giriniz : ");
        Scanner inp = new Scanner(System.in);
        sayi = inp.nextInt();

        int number = sayi;
        while (number != 0) {
            basamak = number % 10;
            result += basamak;
            number /= 10;
        }
        System.out.println("Basamakların toplamı : "+result);


    }
}
