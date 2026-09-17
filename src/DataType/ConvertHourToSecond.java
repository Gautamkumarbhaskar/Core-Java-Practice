import java.sql.SQLOutput;
import java.util.Scanner;
public class ConvertHourToSecond {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value in hour");
        int h = sc.nextInt();
        int s = h * 60 * 60;
        System.out.println("hour value = " + s );


    }
}
