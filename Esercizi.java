import java.util.Scanner;

public class Esercizi {
    public static void main(String[] args) {

        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        double somma = 0;
        double media = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci 3 numeri, uno alla volta: ");
        num1 = scanner.nextInt();

        System.out.print("inserisci il secondo: ");
        num2 = scanner.nextInt();

        System.out.print("inserisci l'ultimo ");
        num3 = scanner.nextInt();

        somma = num1 + num2 + num3;
        media = somma / 3;

        System.out.println("la somma è: " + somma);
        System.out.println(" la media è " + media);

        scanner.close();
    }
}