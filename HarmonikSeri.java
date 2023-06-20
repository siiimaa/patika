import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        int girilenSayi;
        double sonuc = 0, n;
        System.out.println("Bir sayı giriniz : ");
        Scanner inp = new Scanner(System.in);
        girilenSayi = inp.nextInt();

        for (n = 1; n <= girilenSayi; n++){
            sonuc = sonuc + (1 / n);

        }
        System.out.println(sonuc);

    }
}
