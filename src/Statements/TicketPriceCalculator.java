package Statements;

import java.util.Scanner;

public class TicketPriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Age");
        int age = sc.nextInt();

        System.out.println("Day");
        String day = sc.next();
        int price;
        if (age < 12) {
            price = 100;

        } else if (age <= 60) {
            price = 200;
        } else {
            price = 120;

        }
        if (day.equals("weekend")) {
            price = price + 50;

        }
        System.out.println("Total ticket price: " + price);
        sc.close();
    }
}



