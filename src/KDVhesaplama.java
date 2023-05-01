import java.util.Scanner;

public class KDVhesaplama {
    public static void main(String[] args){
        int para;
        Scanner n = new Scanner(System.in);
        System.out.println("Ücreti giriniz: ");
        para = n.nextInt();

        if(para < 1000 && para > 0){
            double KDV = para * 0.18;
            double kdvliUcret = para + KDV;
            System.out.println("KDV'siz ücret : " +  para);
            System.out.println("KDV tutarı : " + KDV);
            System.out.println("KDV'li ücret: "+ kdvliUcret);

        }else if (para >=1000 ){
            double KDV = para * 0.08;
            double kdvliUcret = para + KDV;
            System.out.println("KDV'siz ücret : " +  para);
            System.out.println("KDV tutarı : " + KDV);
            System.out.println("KDV'li ücret: "+ kdvliUcret);

        }






    }
}
