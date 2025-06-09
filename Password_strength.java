import java.util.Scanner;

public class Password_strength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        String password;

        System.out.println("enter your password: ");
        password = scanner.nextLine();
        int passLenght = password.length();
        if (password.isEmpty()){
            System.out.println("password cannot be empty");
        } else {
            if (passLenght >= 8 && password.contains("@")) {
                System.out.println("password accepted, your password is strong!"); 
            } 
            else if (passLenght >= 8 && password.contains("#")) {
                System.out.println("password accepted, your password is strong!");
            }
            else if (passLenght < 8) {
                System.out.println("error: password have to be longer than 8 characters");
            } else {
                System.out.println("error: your password is weak (insert one special character: @,#)");
            }
        }
        scanner.close();
    }
}      
