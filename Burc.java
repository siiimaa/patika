import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        int day, month;

        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen gün giriniz : ");
        day = inp.nextInt();
        System.out.println("Lütfen ay giriniz : ");
        month = inp.nextInt();

        if((month == 1) && ((day <= 31) && (day >= 22)) || ((month == 2) && ((day >=1) && (day <= 19)))) {
            System.out.println("Kova burcusunuz.");
        }else if ((month == 2) && ((day >= 20) && (day <= 29)) || ((month == 3) && ((day >=1) && (day <= 20)))) {
            System.out.println("Balık burcusunuz.");
        }else if ((month == 3) && ((day >= 21) && (day <= 31)) || ((month == 4) && ((day >= 1) && (day <=20)))) {
            System.out.println("Koç burcusunuz.");
        }else if ((month == 4) && ((day >= 21) && (day <= 30)) || ((month == 5) && ((day >= 1) && (day <=21)))) {
            System.out.println("Boğa burcusunuz.");
        }else if ((month == 5) && ((day >= 22) && (day <= 31)) || ((month == 6) && ((day >= 1) && (day <=22)))) {
            System.out.println("İkizler burcusunuz.");
        }else if ((month == 6) && ((day >= 23) && (day <= 30)) || ((month == 7) && ((day >= 1) && (day <=22)))) {
            System.out.println("Yengeç burcusunuz.");
        }else if ((month == 7) && ((day >= 23) && (day <= 31)) || ((month == 8) && ((day >= 1) && (day <=22)))) {
            System.out.println("Aslan burcusunuz.");
        }else if ((month == 8) && ((day >= 23) && (day <= 31)) || ((month == 9) && ((day >= 1) && (day <=22)))) {
            System.out.println("Başak burcusunuz.");
        }else if ((month == 9) && ((day >= 23) && (day <= 31)) || ((month == 10) && ((day >= 1) && (day <=22)))) {
            System.out.println("Terazi burcusunuz.");
        }else if ((month == 10) && ((day >= 23) && (day <= 31)) || ((month == 11) && ((day >= 1) && (day <=21)))) {
            System.out.println("Akrep burcusunuz.");
        }else if ((month == 11) && ((day >= 22) && (day <= 31)) || ((month == 12) && ((day >= 1) && (day <=21)))) {
            System.out.println("Yay burcusunuz.");
        }else if ((month == 12) && ((day >= 22) && (day <= 31)) || ((month == 1) && ((day >= 1) && (day <=21)))) {
            System.out.println("Oğlak burcusunuz.");
        }else{
            System.out.println("Girdiğiniz tarih yanlıştır. Lütfen tekrar deneyiniz.");
        }
    }
}
