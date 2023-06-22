import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        int attempts = 3;
        int ballance = 1500;
        int price;
        int option;

        while (attempts > 0){
            System.out.print("Kullanıcı adınızı giriniz : ");
            userName = inp.next();
            System.out.print("Şifrenizi giriniz : ");
            password = inp.next();

            if (userName.equals("pa123") && password.equals("dev123")) {
                System.out.println("Hoş geldiniz!");
                do {
                    System.out.println("1) Para yatırmak.\n"
                            + "2) Para çekmek.\n"
                            + "3) Bakiye sorgula.\n"
                            + "4) Çıkış yap.");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçin : ");
                    option = inp.nextInt();

                    switch (option) {
                        case 1:
                            System.out.println("Yatırmak istediğiniz para miktarını girin : ");
                            System.out.print(" ");
                            price = inp.nextInt();
                            if (price > 0){
                                ballance += price;
                                System.out.println("Bakiyeniz : " + ballance );
                                System.out.println(" ");
                            }else{
                                System.out.println("Eksi tutarda para yükleyemezsiniz.");
                                System.out.println(" ");
                            }
                            break;


                        case 2:
                            System.out.println("Çekmek istediğiniz para miktarını girin : ");
                            System.out.println(" ");
                            price = inp.nextInt();
                            if (price > 0){
                                if (price > ballance) {
                                    System.out.println("Yetersiz bakiye.");
                                    System.out.println(" ");
                                } else {
                                    ballance -= price;
                                    System.out.println("Bakiyeniz : " + ballance);
                                    System.out.println(" ");
                                }
                            }else{
                                System.out.println("Eksi tutarda para çekemezsiniz.");
                                System.out.println(" ");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + ballance);
                            System.out.println(" ");
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor.");
                            break;
                        default:
                            System.out.println("Yanlış seçenek.");
                            System.out.println(" ");
                            break;
                    }
                }while (option != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;

            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre.");
                System.out.println("Lütfen tekrar deneyiniz");
                --attempts;
                System.out.println("Kalan deneme hakkınız : "+ attempts);
                if (attempts == 0){
                    System.out.println("Kartınız bloke olmuştur.");
                }
                System.out.println(" ");
            }
        }


    }
}