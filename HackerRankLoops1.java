import java.util.Scanner;

public class HackerRankLoops1 {
    public static void main(String[] args) {
        /* n * i = result
        2 * 1 = 2
        2 * 2 = 4
        2 * 3 = 6
        2 * 4 = 8
        2 * 5 = 10
        2 * 6 = 12
        2 * 7 = 14
        2 * 8 = 16
        2 * 9 = 18
        2 * 10 = 20
        */

        int number, result = 1;
        System.out.println( "Please enter a number : ");
        Scanner inp = new Scanner(System.in);
        number = inp.nextInt();

        if ((number >= 2) && (number <= 20)){
            for (int i = 1; i <= 10; i++){
                result = number * i;
                System.out.println(number + " x " + i + " = " + result);
            }
        }else{
            System.out.println("Incorrect operation. Please try again.");
        }
    }
}
