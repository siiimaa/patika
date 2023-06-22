import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int number = inp.nextInt();


        for (int i = 2; i <= number; i++){
            int count = 0;
            for (int i2 = 2; i2 < i; i2++){
                if (i % i2 == 0)
                    count++;
            }
            if (count == 0)
                System.out.print(i +" ");
        }
    }
}
