import java.util.Scanner;

public class Verificacodiceprodotto.java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int pari = 0;
        int dispari = 0;

        System.out.println("inersici il codice prodotto  ");
        System.out.print("solo codici con numeri pari (max 5 cifre): ");
        numero = scanner.nextInt();
        while (numero > 0) {
            int cifra = numero % 10;
            if (cifra % 2 == 0) {
                pari++;
            } else {
                dispari++;
            }
            numero = numero / 10;
        }
        if (dispari <= 0) {
            System.out.println("codice accettato");
        } else {
            System.out.println("codice errato");
        }

        scanner.close();
    }
}
