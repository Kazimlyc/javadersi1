import java.util.Scanner;

public class vucutKitle {
    public static void main(String[] args){
        Scanner deger = new Scanner(System.in);
        System.out.println("Boyunuzu girin :");
        float boy = deger.nextFloat();
        System.out.println("Kilonuzu girin :");
        float kilo = deger.nextFloat();
        float vucutKitleIndeks = kilo / (boy * boy);
        System.out.println("vücut kitle indeksiniz " + vucutKitleIndeks);
    }
}
