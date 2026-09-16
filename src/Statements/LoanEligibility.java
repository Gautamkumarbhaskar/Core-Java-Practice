package Statements;

import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        System.out.println("Enter Salary : ");
        int salary = sc.nextInt();
        System.out.println("Enter Performance : ");
        int performance = sc.nextInt();


        if (age < 21){
            System.out.println("Under age");
    }
            else if (salary < 25000){
        System.out.println("Low salary");
    }
        else if (performance < 700){
            System.out.println("poor performance score");

        }
        else{
            System.out.println("Eligible");
        }
    }
}
