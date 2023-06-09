import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int T;
        double sonuc=0, toplam =0; ;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı giriniz : ");
        T= inp.nextInt();

        int p, k=0;
        for (p = 1; p <= T; p++) {
            if ((p % 12== 0)) {
                k++;
               toplam = toplam + p;
            }
              
        }
               sonuc = toplam / k;
              System.out.println(sonuc);
    }
}