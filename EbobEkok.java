import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        int n1 = inp.nextInt();

        System.out.print("ikinci sayıyı giriniz : ");
        int n2 = inp.nextInt();

        int ebob = 1, ekok = 1, i = 1;

            while (i <= n1) {
                if ((n1 % i == 0) && (n2 % i == 0)) {
                    ebob = i;
                }
                i++;
            }
            System.out.println("Ebob : " + ebob);

            while (i <= n1 * n2) {
                if ((i % n1 == 0) && (i % n2 == 0)) {
                    ekok = i;
                    break;
                }
                i++;
            }
            System.out.println("Ekok : " + ekok);
    }
}
