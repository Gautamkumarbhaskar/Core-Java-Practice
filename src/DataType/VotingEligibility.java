package DataType;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        String Result = (age >= 18) ? "Eligible" : " Not eligible";
        System.out.println("Result :"  +  Result);
        sc.close();

    }
}
