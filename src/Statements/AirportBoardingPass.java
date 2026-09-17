package Statements;

import java.util.Scanner;

public class AirportBoardingPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Check ticket (valid/invalid))");
        String ticket = sc.nextLine();

        System.out.println("Check id (valid/invalid))");
        String id = sc.nextLine();

        System.out.println("Enter luggage weight");
        int weight =  sc.nextInt();

        if (ticket.equals("valid") && id.equals("valid") && weight <= 20)
            System.out.println("Boarding allowed");

        else if (ticket.equals("valid") && id.equals("valid") && weight > 20 && weight <=30 ){
            System.out.println("boarding allowed with excess baggage fee");
        }
else
            System.out.println("Boarding not allowed ");

        }
    }

