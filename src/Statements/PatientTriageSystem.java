package Statements;

import java.util.Scanner;

public class PatientTriageSystem {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Heart rate");
        int heart = sc.nextInt();

        System.out.println("oxygen level");
        double oxygen = sc.nextDouble();

        System.out.println("Consiousness yes/no");
        String consiousness = sc.next();

        System.out.println("Bleeding yes / no ");
        String bleeding = sc.next();

        if (oxygen < 85 || consiousness.equals("no"))
        System.out.println("Critical");

        else if (bleeding.equals("no") && oxygen > 92)
            System.out.println("High priority");

        else if  (heart < 60 )
        System.out.println("Medium priority");

        else
        System.out.println("stable");







    }
}
