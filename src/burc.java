import java.util.Scanner;

public class burc {
    public static void main(String[] args){
        int month, day;

        Scanner input = new Scanner(System.in);

        System.out.println("Kaçıncı ayda doğduğunuzu giriniz: ");
        month = input.nextInt();
        System.out.println("Kaçıncı günde doğduğunuzu giriniz: ");
        day = input.nextInt();

        if(month == 1 && day<= 21){
            System.out.println("Oğlak");
        }else if(month == 1){
            System.out.println("Kova");
        } else if (month == 2 && day <=19) {
            System.out.println("Kova");
        } else if (month == 2) {
            System.out.println("Balık");
        } else if (month == 3 && day <=20) {
            System.out.println("Balık");
        } else if (month == 3) {
            System.out.println("Koç");
        } else if (month == 4 && day <= 20) {
            System.out.println("Koç");
        } else if (month == 4) {
            System.out.println("Boğa");
        } else if (month == 5 && day <= 21) {
            System.out.println("Boğa");
        } else if(month == 5){
            System.out.println("İkizler");
        } else if (month == 6 && day <= 22) {
            System.out.println("İkizler");
        } else if (month == 6) {
            System.out.println("Yengeç");
        } else if (month == 7 && day <= 22) {
            System.out.println("Yengeç");
        } else if (month == 7) {
            System.out.println("Aslan");
        } else if (month == 8 && day <=22) {
            System.out.println("Aslan");
        } else if (month == 8) {
            System.out.println("Başak");
        } else if (month == 9 && day <= 22) {
            System.out.println("Başak");
        } else if (month == 9) {
            System.out.println("Terazi");
        } else if (month == 10 && day <= 22) {
            System.out.println("Terazi");
        } else if (month == 10) {
            System.out.println("Akrep");
        } else if (month == 11 && day <=21){
            System.out.println("Akrep");
        } else if (month == 11) {
            System.out.println("Yay");
        } else if (month == 12 && day <= 21) {
            System.out.println("Yay");
        } else if (month == 12) {
            System.out.println("Oğlak");
        }


    }
}
