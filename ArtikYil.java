import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;
        System.out.println("Yıl giriniz : ");
        Scanner inp = new Scanner(System.in);
        year= inp.nextInt();

        if (((year % 4) == 0) && ((year % 100) == 0) || (year % 4) == 0){
            System.out.println(year + " bir artık yıldır !");
        }else {
            System.out.println(year + " bir artık yıl değildir !");
        }
    }
}
