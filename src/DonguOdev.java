import java.util.Scanner;

public class DonguOdev {
    public static void main(String[] args){
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        a = input.nextInt();
        int sum = 0;
        int sayac = 0;
        for (int i = 1; i<=a; i++){
            if (i % 12 ==0){
                System.out.println(i);
                sum +=i;
                sayac ++;
            }
        }
        System.out.println("ortalama : "+  (sum/sayac));

    }
}
