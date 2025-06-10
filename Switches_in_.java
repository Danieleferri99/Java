import java.util.Scanner;

public class Switches_in_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day;
        System.out.println("which week day is your favourite? ");
        day = scanner.nextLine();//quando si usa switch bisogna sempre impostare delle stampre true
                                 //oppure bisogna impostare una variabile = 0; per dare allo switch il modo di cominciare
        switch (day){
            case "monday1" -> System.out.println("its a weekday");  //in questo modo troviamo ogni caso compilato
            case "thuesday1" -> System.out.println("its weekday");
            case "saturday1" -> System.out.println("its weekend!");
            default -> System.out.println("thats not a day");
        }
        switch (day){
            case "monday2 ", "thuesday3 ", "wednesday4 ", "thuesday5 ", "friday6 " -> 
               System.out.println("it's a weekday"); 
            case "saturday7", "sunday" -> System.out.println("it's weekend!");
        } //ma se più switch appartengono allo stesso caso conviene metteri assieme in modo da far leggere il codice meglio
          //switch: tanti casi su uno stesso valore preciso
          //if: condizioni più flessibili, logiche e complesse
        scanner.close();
    }
    
}
