import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = inp.nextInt();
        int countNumber = 0;

        for (int i = 1; i < number; i++){
            if (number % i == 0){
                countNumber += i;
            }
        }
        if (countNumber == number){
            System.out.println("Girdiğiniz sayı bir mükemmel sayıdır.");
        } else {
            System.out.println("Girdiğiniz sayı bir mükemmel sayı değildir.");
        }

    }
}
