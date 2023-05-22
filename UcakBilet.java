import java.util.Scanner;

public class UcakBilet {
    public static void main(String[] args) {
        double distance, age, typeOfFlight, normalPrice;
        double price1 =0, price2= 0, totalPrice = 0, ageDiscount = 0, typeDiscount;

        //kullanıcıdan verileri topluyoruz
        Scanner inp = new Scanner(System.in);
        System.out.println("Gideceğiniz Mesafeyi Giriniz KM : ");
        distance = inp.nextDouble();
        System.out.println("Yaşınızı giriniz : ");
        age = inp.nextDouble();
        System.out.println("Yolculuk tipini seçin \n1) Tek yön; \n2) Gidiş - Geliş. ");
        typeOfFlight = inp.nextInt();

        normalPrice = distance * 0.10;

        // koşul ekliyoruz
        if ((distance < 0) || (age <= 0)) {
            System.out.println("Yanlış veri girdiniz. Lütfen tekrar deneyin.");
        } else if (age < 12) {
            ageDiscount = normalPrice * 0.50;
            price1 = normalPrice - ageDiscount;
        } else if ((age >= 12) && (age <= 24)) {
            ageDiscount = normalPrice * 0.10;
            price1 = normalPrice - ageDiscount;
        } else if (age >= 65) {
            ageDiscount = normalPrice * 0.30;
            price1 = normalPrice - ageDiscount;
        } else if ((age < 65) && (age > 24)) {
            ageDiscount = 0;
            price1 = normalPrice - ageDiscount;
        }


        if(typeOfFlight == 1){
            typeDiscount = 0;
            price2= price1 - typeDiscount;
            System.out.println(price1);
        }else if (typeOfFlight == 2){
            typeDiscount = price1 * 0.20;
            price2 = (price1 - typeDiscount) *2;
            System.out.println(price2);
        }else {
            System.out.println("Yanlış bilgi");
        }
    }
}


