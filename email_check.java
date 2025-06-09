import java.util.Scanner;

public class email_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        String email1 = "@gmail.com";
        String email;
        String com;

        System.out.println("Insert your e-mail: ");
        email = scanner.nextLine();
        if(email.contains("@")){
            System.out.println("your email contains '@'. ");
        } else {
            System.out.println("error: insert '@'.");
        }
        if(email.contains(".")){
            com = email.substring(email.lastIndexOf("."));
            System.out.printf("your email ends with %s. \n", com);
        } else {
            System.out.println("error: can't recognize domain");
        }
        if(email.endsWith(email1)) {
            System.out.printf("your email ends with %s \nWelcome %s! \n", email1, email);
        } else {
            System.out.println("error: only @gmail.com can be used");
        }
        scanner.close(); 
    }  
}
