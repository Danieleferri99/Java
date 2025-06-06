import java.util.Scanner;

public class Esercizi{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String food;
        double price;
        int counter;
        char currency = '€';
        double total;

        System.out.print("cosa ti piacerebbe mangiare? :");
        food = scanner.nextLine();

        System.out.print("quanto devi pagare? ");
        price = scanner.nextDouble();

        System.out.print("quanti ne vuoi prendere? ");
        counter = scanner.nextInt();

        total = price * counter;

        System.out.println("hai comprato " + counter + " " + food + "/e" + "\ndevi pagare: " + total + currency);
    }

    
}
