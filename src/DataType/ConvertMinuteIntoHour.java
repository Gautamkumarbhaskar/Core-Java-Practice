import java.util.Scanner;
public class ConvertMinuteIntoHour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value in minute");
        int m = sc.nextInt();
        int h = m / 60;
        int remainingminutes = m % 60;
        System.out.println( h + " Hour " + remainingminutes + " Minutes");

    }
}
