import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("uzun kenarı gir: ");
        double uzunKenar=scan.nextInt();
        Scanner scann=new Scanner(System.in);
        System.out.println("kısa kenarı gir: ");
        double kisaKenar=scann.nextInt();
        System.out.println(" Dikdörtgen cevresi: "+ ((2*uzunKenar)+(2*kisaKenar)));
        System.out.println(" Dikdörtgen alanı: "+ (uzunKenar*kisaKenar));


    }
}