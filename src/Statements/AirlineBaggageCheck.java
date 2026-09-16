package Statements;

import java.util.Scanner;

public class AirlineBaggageCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your airline");
        String airline = sc.nextLine();
        System.out.println("Enter the weight of the bag");
        double bagWeight = sc.nextDouble();
        switch (airline) {
            case "airindia":
                if (bagWeight > 50) {
                double toremove = bagWeight - 50;
                System.out.println("The bag is overweight,remove : " + toremove + "kgs");
            }

        else {
                System.out.println("Bag is accepted");
            }
            break;

            case  ("indigo"):
                if (bagWeight > 45) {
                    double toremove = bagWeight - 45;
                    System.out.println("The bag is overweight,remove : " + toremove + "kgs");
                } else {
                    System.out.println("Bag is accepted");
                }
break;
            default:
                System.out.println("Invalid airline");

        }

    }
}










