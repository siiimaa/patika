import java.util.Scanner;

public class PratikFaktoriyel {
    public static void main(String[] args) {
    int n, r, fark, totalN = 1, totalR = 1, totalFark = 1, sonuc;

    System.out.printf("n değerini giriniz : ");
    Scanner inp = new Scanner(System.in);
    n = inp.nextInt();

    System.out.printf("r değerini giriniz : ");
    r = inp.nextInt();

    fark = n - r;

    for (int araN = 1; araN < n; araN++) {
            totalN *= araN;
    }for (int araR = 1; araR < r; araR++) {
            totalR *= araR;
    }for (int araFark = 1; araFark < fark; araFark++) {
            totalFark *= araFark;
        }
        sonuc = totalN / ( totalR * totalFark);
        System.out.printf("C(n, r) = "+sonuc);
    }
}
