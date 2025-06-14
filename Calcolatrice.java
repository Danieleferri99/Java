import java.util.Scanner;

public  class Calcolatrice { 
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String operazione;
        boolean calcolatrice = true;

        while (calcolatrice){
            System.out.println("scegli l'operazione: ");
            System.out.println("1. somma ");
            System.out.println("2. sottrai ");
            System.out.println("3. moltiplica ");
            System.out.println("4. dividi ");
            System.out.println("5. esci ");
            operazione = scanner.nextLine();

            switch (operazione){
            case "1" -> System.out.printf("il risultato è: %.2f\n", somma());
            case "2" -> System.out.printf("il risultato è: %.2f\n", sottrai());
            case "3" -> System.out.printf("il risultato è: %.2f\n", moltiplica());
            case "4" -> dividi();
            case "5" -> {
                System.out.print("grazie e arrivederci. ");
                calcolatrice = false;
            }
            default -> {
                System.out.print("errore: operazione non valida. ");
            }
        }
        }
    } 
    static double somma(){
    System.out.print("inserisci numero 1: ");
    double num1 = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("inserisci numero 2: ");
    double num2 = scanner.nextDouble();
    scanner.nextLine();
    return num1 + num2;
    } 
    static double sottrai(){
    System.out.print("inserisci numero 1: ");
    double num1 = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("inserisci numero 2: ");
    double num2 = scanner.nextDouble();
    scanner.nextLine();
    return num1 - num2;
    } 
    static double moltiplica(){
    System.out.print("inserisci numero 1: ");
    double num1 = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("inserisci numero 2: ");
    double num2 = scanner.nextDouble();
    scanner.nextLine();
    return num1 * num2;
    }
    static void dividi(){
    System.out.print("inserisci numero 1: ");
    double num1 = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("inserisci numero 2: ");
    double num2 = scanner.nextDouble();
    scanner.nextLine();
    if (num2 == 0) {
        System.out.println("errore impossibile dividere per 0 ");
    } else {
        System.out.printf("il risultato è: %.2f\n", num1 / num2);
    }
    }
}
