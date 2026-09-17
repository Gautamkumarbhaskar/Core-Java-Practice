
import java.util.Scanner;
public class ConvertHourSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of hours: ");
        int hour = sc.nextInt();
        int second  = hour*3600;

        System.out.println("Seconds = "   + second);

        sc.close();


    }
}
