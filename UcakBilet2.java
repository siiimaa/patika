import java.util.Scanner;

public class UcakBilet2 {
    public static void main(String[] args) {
        double distance, age, typeOfFlight, discountPrice = 0, normalPrice;

        //kullanıcıdan verileri topluyoruz
        Scanner inp = new Scanner(System.in);
        System.out.println("Gideceğiniz Mesafeyi Giriniz KM : ");
        distance = inp.nextDouble();
        System.out.println("Yaşınızı giriniz : ");
        age = inp.nextDouble();
        System.out.println("Yolculuk tipini seçin \n1) Tek yön; \n2) Gidiş - Geliş. ");
        typeOfFlight = inp.nextInt();

        normalPrice = distance * 0.10;

        if ((distance > 0) && (age > 0) && ((typeOfFlight == 1) || (typeOfFlight == 2))) {
            if (age < 12) {
                discountPrice = normalPrice *= 0.50;
            } else if ((age >= 12) && (age <= 24)) {
                discountPrice = normalPrice *= 0.90;
            } else if (age >= 65) {
                discountPrice = normalPrice *= 70;
            }
            if (typeOfFlight == 2) {
                discountPrice = normalPrice *= 0.80;
                System.out.println("Toplam bilet fiyatı : " +discountPrice + "TL.");
            }else {
                System.out.println("Toplam bilet fiyatı : " +discountPrice + "TL.");
            }
        }else {
            System.out.println("Yanlış bilgi girdiniz.");
        }
    }
}