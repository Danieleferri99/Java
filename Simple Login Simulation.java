
import java.util.Scanner;

public class Simple Login Simulation {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String userName;
        String correctName = "Admin";
        String password;
        String correctPasword = "1234";

        System.out.print("Enter Username: ");
        userName = scanner.nextLine();
        if (userName.equals(correctName)) {
            System.out.print("enter you password ");
            password = scanner.nextLine();
            if (password.equals(correctPasword)) {
                System.out.println("login successful ");
            } else {
                System.out.println("error: incorrect password ");
            }
        } else {
            System.out.println("error: incorrect username.");
        }
        scanner.close();
    }
}
