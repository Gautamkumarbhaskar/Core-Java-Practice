import java.sql.SQLOutput;
import java.util.Scanner;
public class ConverCelsiusToFahrenheat {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value in farenheit");
       double f = sc.nextDouble();
       double c = (f-32)*5/9;
       System.out.println("celsius = " + c);

    }
}
