import java.util.Scanner;

public class RecursiveAsalSayi {
    static boolean isPrime(int number, int i){

        if (number < 2)                       //en küçük asal sayı 2 dir.
            return false;
        if (number == 2)
            return true;
        if (number % i == 0){
            if (i == 1) {
                return isPrime(number, i + 1);
            }else if (i == number) {
                return true;
            }else{
                return false;
            }
        }else{
            return isPrime(number, i + 1);
        }

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = inp.nextInt();
        if (isPrime(number, 1)){
            System.out.println(number + " sayısı ASALDIR!");
        }else{
            System.out.println(number + " sayısı ASAL değildir!");
        }
    }
}