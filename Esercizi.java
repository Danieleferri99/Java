import java.util.Scanner;

public class Esercizi{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int gradiC = 0;
        int gradiF = 0;
        
        System.out.println("inserisci gradi celsius convertirò in fahrenheit: ");
        gradiC = scanner.nextInt();

        gradiF = (gradiC * 9/5) + 32;

        System.out.println("ci sono attualmente: " + gradiF + " gradi fahrenheit.");

        scanner.close();

    }

    
}