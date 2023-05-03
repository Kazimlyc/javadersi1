import java.util.Scanner;

public class havaSicakligi {
    public static void main(String[] args){

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklığı giriniz : ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.println("kayak yapabilirsiniz");
        }else if(heat < 15 && heat >= 5 ){
            System.out.println("sinemaya gideblirsiniz");
        }else if (heat < 25 && heat >=15){
            System.out.println("pikniğe gidebilirsiniz");
        } else if (heat >= 25) {
            System.out.println("yüzmeye gidebilirisinz");
        }

    }
}
