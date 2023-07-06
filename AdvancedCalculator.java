import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class AdvancedCalculator {

    static int plus (){                                 //1 - Toplama İşlemi
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayı'yı giriniz : ");
        int a = inp.nextInt();
        System.out.print("İkinci sayı'yı giriniz : ");
        int b = inp.nextInt();

        int result = a + b;
        System.out.println("Sonuç : " + result);
        return result;
    }
    static int minus (){                                //2 - Çıkarma İşlemi
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayı'yı giriniz : ");
        int a = inp.nextInt();
        System.out.print("İkinci sayı'yı giriniz : ");
        int b = inp.nextInt();

        int result = a - b;
        System.out.println("Sonuç : " + result);
        return result;
    }
    static int multiply (){                             //3 - Çarpma İşlemi
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayı'yı giriniz : ");
        int a = inp.nextInt();
        System.out.print("İkinci sayı'yı giriniz : ");
        int b = inp.nextInt();

        int result = a * b;
        System.out.println("Sonuç : " + result);
        return result;
    }
    static int division (){                             //4 - Bölme İşlemi
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayı'yı giriniz : ");
        int a = inp.nextInt();
        System.out.print("İkinci sayı'yı giriniz : ");
        int b = inp.nextInt();

        if (b == 0){
            System.out.println("İkinci sayı 0' dan fazla olmalı.");
            return 0;
        }
        int result = a / b;
        System.out.println("Sonuç : " + result);
        return result;
    }
    static int exp (){                                   //5 - Üslü Sayı Hesaplama İşlemi
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayı'yı giriniz : ");
        int a = inp.nextInt();
        System.out.print("İkinci sayı'yı giriniz : ");
        int b = inp.nextInt();

        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        System.out.println("Sonuç : " + result);
        return result;
    }
    static int factorial (){                             //6 - Faktöriyel Hesaplama İşlemi
        Scanner inp = new Scanner(System.in);
        int result = 1;
        System.out.print("Sayı giriniz : ");
        int n = inp.nextInt();
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        System.out.println("Sonuç : " + result);
        return result;
    }
    static int mode(){                                    //7 - Mod Alma İşlemi
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayı'yı giriniz : ");
        int a = inp.nextInt();
        System.out.print("İkinci sayı'yı giriniz : ");
        int b = inp.nextInt();

        int result = a % b;
        System.out.println("Sonuç : " + result);
        return result;
    }
    static void calc(){                                    //8 - Dikdörtgen Alan ve Çevre Hesabı
        int p, s;
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayı'yı giriniz : ");
        int a = inp.nextInt();
        System.out.print("İkinci sayı'yı giriniz : ");
        int b = inp.nextInt();

        p = (a + b) * 2;
        System.out.println("Çevre hesabı sonucu : " + p);
        s = a * b;
        System.out.println("Alan hesabı sonucu : " + s);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1 - Toplama İşlemi \n"
                    + "2 - Çıkarma İşlemi \n"
                    + "3 - Çarpma İşlemi \n"
                    + "4 - Bölme İşlemi \n"
                    + "5 - Üslü Sayı Hesaplama İşlemi \n"
                    + "6 - Faktöriyel Hesaplama İşlemi \n"
                    + "7 - Mod Alma İşlemi \n"
                    + "8 - Dikdörtgen Alan ve Çevre Hesabı\n"
                    + "0 - Çıkış Yap";
        while (true) {
            System.out.println(" ");
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz : ");
            select = inp.nextInt();

            if (select == 0) {
                break;
            }

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    exp();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    calc();
                    break;

                default:
                    System.out.println("Yanlış bir değer girdiniz. Lütfen tekrar deneyiniz.");
            }
        }
        System.out.print("Görüşmek üzere.");

    }
}
