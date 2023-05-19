import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy, kilo, Indeks  ;

        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu (kg cinsinde) giriniz : ");
        kilo = input.nextDouble();

        System.out.print("Boyunuzu (m cinsinde) giriniz : ");
        boy = input.nextDouble();

        Indeks = (kilo / (boy * boy));

        System.out.println("Vücut kitle indeksiniz : " + Indeks);

    }
}