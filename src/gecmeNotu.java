import java.util.Scanner;

public class gecmeNotu {
    public static void main(String[] args){
        int matematik, fizik, turkce, kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        matematik = input.nextInt();
        int mat = (matematik > 100 || matematik < 0) ? 0 : matematik;

        System.out.println("Fizik notunuz : ");
        fizik  = input.nextInt();
        int fiz = (fizik > 100 || fizik < 0) ? 0 : fizik;

        System.out.println("Türkçe notunuz : ");
        turkce = input.nextInt();
        int tur = (turkce > 100 || turkce < 0)? 0: turkce;

        System.out.println("Kimya notunuz : ");
        kimya = input.nextInt();
        int kim = (kimya > 100 || kimya <0 ) ? 0 : kimya;

        System.out.println("Muzik notunuz : ");
        muzik = input.nextInt();
        int muz = (muzik > 100 || muzik < 0 ) ? 0 : muzik;

        double avarage = (mat + fiz + tur + kim + muz)/5;
        if (avarage <= 55){
            System.out.println("Sınıfta kaldınız");
        }else{
            System.out.println("tebrikler geçtiniz");
        }



    }
}
