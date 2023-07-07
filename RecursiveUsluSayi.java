import java.util.Scanner;

public class RecursiveUsluSayi {
    static int exp (){
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        int ussuAlinan = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int us = inp.nextInt();

        int result = 1;
        for (int i = 1; i <= us; i++){
            result *= ussuAlinan;
        }
        System.out.print("Sonuç : ");
        return result;
    }
    public static void main(String[] args) {
        int result = exp();
        System.out.println(result);
    }
}
