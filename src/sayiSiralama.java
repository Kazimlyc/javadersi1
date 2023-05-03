import java.util.Scanner;

public class sayiSiralama {
    public static void main(String[] args){
        int a,b,c, enBuyuk, ortanca, enKucuk;
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        a= input.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        b= input.nextInt();
        System.out.println("Üçüncü sayıyı giriniz : ");
        c= input.nextInt();

        if (a > b && a > c){
            enBuyuk = a;
            if (b > c){
                ortanca = b;
                enKucuk = c;
            }else{
                ortanca = c;
                enKucuk = b;
            }
        }else if ( b > a && b > c){
            enBuyuk = b;
            if (a > c ){
                ortanca = a;
                enKucuk = c;
            }else {
                ortanca = c;
                enKucuk = a;
            }
        }else {
            enBuyuk = c;
            if (a > b ){
                ortanca = a;
                enKucuk = b;
            }else {
                ortanca = b;
                enKucuk = a;
            }
        }
        System.out.println("en küçük : " + enKucuk + "\nortanca : " + ortanca + "\nen büyük : "+ enBuyuk);
        System.out.println(enKucuk +"<" + ortanca + "<" + enBuyuk);

    }
}
