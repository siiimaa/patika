import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz : ");
        int satirSayisi = inp.nextInt();

        for (int satir = satirSayisi  - 1; satir >= 0; satir--){
            for (int bosluk = 0; bosluk < satirSayisi  - satir; bosluk++){
                System.out.print(" ");
            }
            for (int yildiz = 0; yildiz < (2* satir) + 1; yildiz++){
                System.out.print("*");
            }
            System.out.println( );
        }


    }
}
