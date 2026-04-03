import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Locale.setDefault(new Locale("pt","BR"));
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor da da compra: ");
        double subtotal = sc.nextDouble();

        System.out.println("Informe o valor pago: ");
        double valorPago = sc.nextDouble();

        double troco = valorPago - subtotal;

        int centavos = (int) Math.round(troco * 100);

        int notas50 = centavos / 5000;
        centavos = centavos % 5000;

        int notas20 = centavos / 2000;
        centavos = centavos % 2000;

        int notas10 = centavos / 1000;
        centavos = centavos % 1000;

        int notas5 = centavos / 500;
        centavos = centavos % 500;

        int notas2 =  centavos / 200;
        centavos = centavos % 200;

        int moedas1 = centavos / 100;
        centavos = centavos % 100;

        System.out.println("TROCO:");
        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 20: " + notas20);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 5: "  + notas5);
        System.out.println("Notas de 2: "  + notas2);
        System.out.println("Moedas de 1: " + moedas1);

        sc.close();


    }
}
