import java.util.Scanner;
public class ConvertMinuteHour{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minutes : ");
        int min = sc.nextInt();
        int hour = min/60;
        int remainingMinutes = min%60;
        System.out.println(min + " minute = " + hour + " hour " + remainingMinutes + " minute ");
    }
}

