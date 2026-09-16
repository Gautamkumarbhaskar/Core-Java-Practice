import java.util.Scanner;
public class ConvertSecondIntoHourMinuteSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number in second");
        int totalsecond = sc.nextInt();
        int totalhour = totalsecond / 3600;
        int totalminute = totalsecond % 3600 / 60;
        int totalseconds = totalsecond % 60;
        System.out.println(totalhour+"hour "  +  totalminute+"minute " + totalseconds + "second ");



    }
}
