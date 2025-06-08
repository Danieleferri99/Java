
import java.util.Scanner;

public class calcolo_ipotenusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        double raggio;
        double circonferenza;
        double PI;
        double area;
        double Volume;

        
        System.out.print("enter the radius: ");
        raggio = scanner.nextDouble();
        PI = Math.PI;
        circonferenza = (2 * PI) * raggio;
        area = PI * (Math.pow(raggio, 2));
        Volume = (4.0/3.0) * PI *(Math.pow(raggio, 3));

        System.out.printf("circonferenza è di %.2f\n" , circonferenza); 
        System.out.printf("l'area è di %.2f\n" , area);
        System.out.printf("il volume è di %.2f\n" , Volume);
        scanner.close();
    }
}

