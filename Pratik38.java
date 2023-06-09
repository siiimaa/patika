import java.util.Scanner;
public class Pratik38 {
    public static void main(String[] args) {
        int T;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı giriniz : ");
        T= inp.nextInt();

        int p;
        for (p = 1; p <= T; p++) {
            if ((p % 3 == 0) || (p % 4 == 0)) {
                System.out.println(p);
            }
        }
    }
}
