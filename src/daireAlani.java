import java.util.Scanner;

public class daireAlani {
    public static void main(String[] args){
        double yaricap;
        double pi = 3.14;
        double alan2;
        Scanner deger = new Scanner(System.in);
        System.out.println("Dairenin yarı çapını giriniz: ");
        yaricap = deger.nextDouble();
        double alan = pi*yaricap*yaricap;
        double cevre = 2*pi*yaricap;

        System.out.println("alanı :" + alan);
        System.out.println("çevresi : "+ cevre);
        System.out.println("açı ölcüsünü giriniz");
        int aci = deger.nextInt();
        alan2 = (pi*(yaricap*yaricap)* aci)/360;
        System.out.println("merkez açısının ölçüsü : " + aci + " bu dilimin alanı : " + alan2 );
    }
}
