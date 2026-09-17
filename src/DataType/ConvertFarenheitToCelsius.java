import java.util.Scanner;
public class ConvertFarenheitToCelsius {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value in celsius");
        double c =  scan.nextDouble();
        double f = (c * 1.8) + 32;
        System.out.println("Forenheit =" + f);
        scan.close();
    }
}