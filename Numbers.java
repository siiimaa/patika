import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        double  number1, number2, number3;

        //kullanıcıdan bilgileri topluyoruz
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        number1 = inp.nextDouble();
        System.out.println("İlk sayınız : "+number1);

        System.out.println("Bir sayı giriniz : ");
        number2 = inp.nextDouble();
        System.out.println("İkinci sayınız : "+number2);

        System.out.println("Bir sayı giriniz : ");
        number3 = inp.nextDouble();
        System.out.println("Üçüncü sayınız : "+number3);

        //koşul ekliyoruz
        if ((number1 <= number2) && (number1 <= number3)){
            if (number2 <= number3){
                System.out.println(number1 + " < " + number2 + " < " + number3);
            }else if (number3 <= number2){
                System.out.println(number1 + " < " + number3 + " < " + number2);
            }
        }else if ((number2 <= number1) && (number2 <= number3)){
            if (number1 <= number3) {
                System.out.println(number2 + " < " + number1 + " < " + number3);
            }else if(number3 <= number1){
                System.out.println(number2 + " < " + number3 + " < " + number1);
            }
        }else if((number3 <= number1) && (number3 <= number2)){
            if (number1 <= number2){
                System.out.println(number3 + " < " + number1 + " < " + number2);
            }else if (number2 <= number1){
                System.out.println(number3 + " < " + number2 + " < " + number1);
            }
        }
    }
}
