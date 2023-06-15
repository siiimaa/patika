import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		  int girilenSayi;
		  System.out.print("Bir sayı giriniz : ");
		  
		  Scanner inp = new Scanner (System.in);
		  girilenSayi = inp.nextInt();
		  
		  int dort, bes, ikisiDe;
		  for (ikisiDe = 20; ikisiDe < girilenSayi; ikisiDe = ikisiDe * 20){
		      System.out.println(ikisiDe);
		  } for (dort = 4; dort < girilenSayi; dort = dort * 4){
		      System.out.println(dort);
		  } for (bes = 5; bes < girilenSayi; bes = bes * 5){
		      System.out.println(bes);
		  }
		 
	}
}