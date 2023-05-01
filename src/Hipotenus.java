import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args){
        System.out.println("Üçgenin kenar uzunluklarını girin : ");
        Scanner giris = new Scanner(System.in);
        int a = giris.nextInt();
        int b = giris.nextInt();
        double c = Math.sqrt((a*a) + (b*b));

        double u =  (a + b + c)/2;
        double cevre = 2*u;
        double alan =  Math.sqrt(u*(u-a) *(u-b)*(u-c));

        System.out.println("hipotenüs: " + c);
        System.out.println("çevre :" + cevre);
        System.out.println("alan : " + alan);


    }
}
