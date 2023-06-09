import java.util.Scanner;

public class TekSayiToplam {
    public static void main(String[] args) {
        int m, toplam = 0;
        Scanner inp = new Scanner(System.in);


        
        do {
            System.out.print("Sayı giriniz : ");
            m= inp.nextByte();
            if ((m % 2 == 0) || (m % 4 == 0)){
                toplam += m;  
               
            }
        } while (m % 2 == 0);


        System.out.println(toplam);
    }
}