import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        int n = inp.nextInt();
        int total = 0;
        int a = 0;
        int b = 1;
        int i = 0;

        while (i < n){
            total = a + b;
            System.out.print(a + " ");
            a = b;
            b = total;
            i++;
        }
    }
}
