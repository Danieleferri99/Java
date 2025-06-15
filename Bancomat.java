
import java.util.ArrayList;
import java.util.Scanner;

public  class Bancomat { 
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       int pin = 12345; 
       boolean isRunning = true;
       int tentativi = 2;
       int operazione;
       double saldo = 50.50;
       ArrayList<String> movimenti = new ArrayList<>();

       while (isRunning){
        System.out.println("inserisci il tuo pin: ");
        pin = scanner.nextInt();
        if (pin == 12345){
            System.out.println("Benvenuto utente.");
            while (isRunning){
                System.out.println("1. saldo");
                System.out.println("2. depositare");
                System.out.println("3. prelevare");
                System.out.println("4. estratto conto");
                System.out.println("5. esci");
                System.out.print("selezionare l'operazione: ");
                operazione = scanner.nextInt();

                switch(operazione){
                    case 1 -> totale(saldo);
                    case 2 -> {
                        System.out.print("Quanto vuoi depositare? ");
                        double deposito = scanner.nextDouble();
                        saldo += deposito;
                        movimenti.add("Deposito: +" + deposito + " | Saldo attuale: " + saldo);
                    }
                    case 3 -> {
                        System.out.print("Quanto vuoi prelevare? ");
                        double ritiro = scanner.nextDouble();
                        if (ritiro > saldo){
                            System.out.println("errore credito non sufficente");
                        } else {
                            saldo -= ritiro;
                        movimenti.add("Ritiro: -" + ritiro + " | Saldo attuale: " + saldo);
                        }  
                    }
                    case 4 -> {
                        System.out.println("Movimenti:");
                        for (String movimento : movimenti) {
                        System.out.println(movimento);     
                        }
                    }
                    case 5 -> {
                        System.out.println("grazie ed arrivederci. ");
                        isRunning = false;
                    }
                    default -> System.out.println("errore: operazione non riconosciuta");
                
                }
            }
        }
        else if (tentativi == 0){
                System.out.println("tentativi esauriti, carta bloccata.");
                isRunning = false;
        } else {
            System.out.printf("errore: %d tentativi rimasti", tentativi);
            tentativi --; 
        }
    
        }
       
    } static void totale(double saldo){
        System.out.printf("saldo: %.2f$. \n", saldo);
    }  
} 
       
