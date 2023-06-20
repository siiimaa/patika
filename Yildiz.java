import java.util.Scanner;

public class Yildiz {
    public static void main(String[] args) {
        System.out.println("Basamak sayısı : ");
        Scanner inp = new Scanner(System.in);
        int basamakSayisi = inp.nextInt();

        for (int satir = 0; satir < (basamakSayisi / 2) + 1; satir++){
            for (int bosluk = 0; bosluk < (basamakSayisi / 2) -satir; bosluk++) {
                System.out.print(" ");
            }
            for (int yildiz = 0; yildiz < (2 * satir) + 1; yildiz++){
                System.out.print("*");
            }
            System.out.println( );

        }

        for ( int satir = (basamakSayisi / 2) - 1; satir >= 0; satir--) {
            for (int bosluk = 0; bosluk < (basamakSayisi /2) - satir; bosluk++) {
                System.out.print(" ");
            }
            for (int yildiz = 0; yildiz < (2 * satir) + 1; yildiz++) {
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}