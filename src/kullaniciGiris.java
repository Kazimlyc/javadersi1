import java.util.Scanner;

public class kullaniciGiris {
    public static void main(String[] args){

        String userName, userPassword, password2;
        boolean check = true;
        Scanner input = new Scanner(System.in);
        String password1 = "123";

        System.out.println("Kullanıcı adınız: ");
        userName = input.nextLine();
        System.out.println("Şifreniz: ");
        userPassword = input.nextLine();

        if(userName.equals("kazım")){
            if (userPassword.equals(password1)){
                System.out.println("giriş yapıldı");
            }else {
                System.out.println("Şifre sıfırlamak isterseniz 1'e basın");
                int secenek;
                secenek = input.nextInt();
                if (secenek == 1){
                    while (check) {
                        System.out.print("Lütfen yeni şifrenizi giriniz: ");
                        password2 = input.next();
                        if (password2.equals(password1) || (password2.equals(userPassword)))
                            System.out.println("Şifre oluşturulamadı. Lütfen tekrar deneyiniz.");

                        else {
                            System.out.print("Şifre oluşturuldu");
                            check = false;
                        }
                }
            }else {
                System.out.println("bilgileriniz yanlış");}
            }
        }else {
            System.out.println("bilgileriniz yanlış");
        }

    }
}
