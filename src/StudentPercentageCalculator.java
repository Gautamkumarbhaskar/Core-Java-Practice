
import java.util.Scanner;
public class StudentPercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter physics mark");
        float physicsmark = sc.nextFloat();
        System.out.println("Enter math mark");
        float mathmark = sc.nextFloat();
        System.out.println("Enter bio mark");
        float biomark = sc.nextFloat();
        float percentage;
        StudentPercentageCalculator p1 = new StudentPercentageCalculator();
        percentage = ((physicsmark + mathmark + biomark) * 100 / 300);

        System.out.println("percentage = " + percentage);
        sc.close();
}
}
