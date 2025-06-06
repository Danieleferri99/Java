import java.util.Scanner;

public class Calcolo del perimetro di un rettangolo {
    public static void main(String[] args){

        int base = 0;
        int altezza = 0;
        int perimetro = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci la base: ");
        base = scanner.nextInt();

        System.out.println("inserisci l'altezza ");
        altezza = scanner.nextInt();

        perimetro = 2 * (base + altezza); 

        System.out.println("il perimetro è di: " + perimetro);

        scanner.close();

    }

    
}
