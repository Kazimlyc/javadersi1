import java.util.Scanner;

public class manav {
    public static void main(String[] args){
        Scanner kilo = new Scanner(System.in);
        double toplam1,toplam2,toplam3,toplam4,toplam5;
        double armut = 2.14, elma=3.67,domates =1.11,muz= 0.95,patlican=5.00;
        System.out.println("Armut kaç kilo ? ");
        int kgar = kilo.nextInt();
        toplam1 = kgar * armut;
        System.out.println("Elma kaç kilo ? ");
        int kgel = kilo.nextInt();
        toplam2 = kgel * elma;
        System.out.println("Domates kaç kilo ? ");
        int kgdo = kilo.nextInt();
        toplam3 = kgdo * domates;
        System.out.println("Muz kaç kilo ? ");
        int kgmu = kilo.nextInt();
        toplam4 = kgmu * muz;
        System.out.println("patlıcan kaç kilo ? ");
        int kgpa = kilo.nextInt();
        toplam5 = kgpa * patlican;

        System.out.println("toplam tutar " + (toplam1+toplam2+toplam3+toplam4+toplam5));


    }
}
