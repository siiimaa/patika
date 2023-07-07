import java.util.Scanner;

public class RecursiveDeseneGoreMetot {
    static void figure(int number, int tempNumber){
        if (number > 0){
            System.out.print(number + " ");
            figure(number - 5, tempNumber);
        }
        if (number <= 0){
            figure2(number, tempNumber);
        }
    }
    static void figure2(int number, int tempNumber){
        if (number <= tempNumber){
            System.out.print(number + " ");
            figure2(number + 5, tempNumber);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin : ");
        int number = inp.nextInt();
        int tempNumber = number;
        figure(number, tempNumber);
    }
}
