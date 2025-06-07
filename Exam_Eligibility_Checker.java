
import java.util.Scanner;

public class  Exam_Eligibility_Checker{
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int hour;
        boolean studentId;

        System.out.print("whats your name? ");
        name = scanner.nextLine();
        if (name.isEmpty()) {
            System.out.print("error: enter your name");
        } else {
            System.out.println("hello " + name + "!");
            System.out.print("how many hours did you study? ");
            hour = scanner.nextInt();
            if (hour >= 10) {
                System.out.print("do you have your student ID? (true/false) ");
                studentId = scanner.nextBoolean();
                if (studentId) {
                    System.out.println("you're elegible, " + name + "!");
                } else {
                    System.out.println("you're not elegible, you need to insert an ID ");
                }
            } else {
                System.out.println("you're not elegible, you have to study more hour per day");
            }
        }
        scanner.close();

    }
}
