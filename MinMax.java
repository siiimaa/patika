import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in );
        int countNumber;
        int number, tempMax = Integer.MIN_VALUE, tempMin = Integer.MAX_VALUE;
        do {
            System.out.print("Kaç tane sayı gireceksiniz : ");
            countNumber = inp.nextInt();

            if (countNumber < 2) {
                System.out.println("En az iki sayı giriniz");
            }
        } while (countNumber < 2);

        for (int i = 1; i <= countNumber; i++){
            System.out.print(i+". Sayıyı giriniz : ");
            number = inp.nextInt();

            if (number > tempMax){
                tempMax = number;
            } else if (number < tempMin) {
                tempMin = number;
            }
        }
        System.out.println("En büyük sayı : " + tempMax);
        System.out.println("En küçük sayı : " + tempMin);


    }
}