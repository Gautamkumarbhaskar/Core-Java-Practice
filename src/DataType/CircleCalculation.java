package DataType;

import java.util.Scanner;
public class CircleCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("radius ");
        double radius = sc.nextDouble();

        System.out.println("Diameter = " + 2*radius );
        System.out.println("Area = " + 3.14 * radius * radius);
        System.out.println("Circumference = " + 2 * 3.14 * radius);
        sc.close();

    }
}
