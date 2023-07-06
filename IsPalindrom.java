import java.util.Scanner;

public class IsPalindrom {
    static boolean isPalindrom (int number){
        Scanner inp = new Scanner(System.in);
        number = inp.nextInt();
        int     tempNumber = number,
                reverseNumber = 0,
                lastNumber;

        while (tempNumber != 0){
            lastNumber = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            tempNumber /= 10;
        }

        if (number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        System.out.println(isPalindrom(0));
    }
}
