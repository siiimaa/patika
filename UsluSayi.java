import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int sayi, us;
        Scanner inp = new Scanner(System.in);
            System.out.printf("Üssü alınacak sayı giriniz : ");
        sayi = inp.nextInt();
            System.out.printf("Üs olacak sayı giriniz : ");
        us = inp.nextInt();


        int total = 1;
        for (int i = 1; i <= us; i++){
            total *= sayi;
        }
        System.out.printf("Sonuç : "+total);
    }
}
