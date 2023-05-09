import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args){
        int mesafe, yas, yolTipi;
        double normalTutar, indirimliTutar = 0, yasIndirim, yolIndirim;

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi km olarak giriniz : ");
        mesafe = input.nextInt();
        if (mesafe <= 0 ){
            System.out.println("Hatalı veri girdiniz!!");
        }
        normalTutar = mesafe * 0.10;
        System.out.println("Yolcunun yaşını giriniz : " );
        yas = input.nextInt();
        if (yas < 0){
            System.out.println("Hatalı veri girdiniz!" );
        } else if (yas < 12) {
            yasIndirim = normalTutar / 2;
            indirimliTutar = normalTutar - yasIndirim;
        } else if(yas <24){
            yasIndirim = normalTutar* 0.10;
            indirimliTutar = normalTutar - yasIndirim;
        } else if (yas > 65) {
            yasIndirim = normalTutar * 0.30;
            indirimliTutar = normalTutar - yasIndirim;
        }else {yasIndirim = 0;
            indirimliTutar = normalTutar - yasIndirim;
        }


        System.out.println("Yolculuk tipini seçiniz \n1=>Tek yön\n2=>Gidiş Dönüş");
        yolTipi = input.nextInt();
        if (yolTipi == 1){
            System.out.println(indirimliTutar   );
        } else if ( yolTipi == 2) {
            yolIndirim = indirimliTutar *0.20;
            System.out.println((indirimliTutar - yolIndirim)*2);
        }
    }
}