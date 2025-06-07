
import java.util.Scanner;

public class Weather_Advisor{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float temperature;
        boolean rain;

        // ask to user
        System.out.print("what's the temperature today? ");
        temperature = scanner.nextFloat();
        if (temperature < 15) {
            System.out.print("is it raining? (true/false) ");
            rain = scanner.nextBoolean();
            if (rain) {
                System.out.println("wear a jacket and bring an umbrella. ");
            } else {
                System.out.println("wear a jacket its cold ");
            }
        } else {
            System.out.print("is it raining? (true/false) ");
            rain = scanner.nextBoolean();
            if (rain) {
                System.out.println("bring an umbrella. ");
            } else {
                System.out.println("enjoy the sun! ");
            }
        }
        scanner.close();
    }
}
