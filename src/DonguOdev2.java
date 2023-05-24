import java.util.Scanner;

public class DonguOdev2 {
    public static void main(String[] args){
        int sum = 0,a;
        Scanner input = new Scanner(System.in);


        do {
            System.out.println("sayı giriniz");
            a = input.nextInt();
            if (a % 2 ==1 ) break;
            sum += a;
            System.out.println("toplam " + sum);


        }while (a % 2 == 0);
    }
}
