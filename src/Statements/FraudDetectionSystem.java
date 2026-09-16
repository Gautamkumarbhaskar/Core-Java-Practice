package Statements;

import java.util.Scanner;

public class FraudDetectionSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total trancsaction amount ");
        int transaction = sc.nextInt();
        sc.nextLine();

        System.out.println("Transaction city (samecity or differentcity)");
        String city = sc.nextLine();


        System.out.println("Number of trancsactions in last 1 hour");
        int num = sc.nextInt();

      if  (transaction > 100000  && city.equals("differentcity")) {

          System.out.println("Block Transaction");

      }
      else if (  num > 5  ) {
          System.out.println("manual verification required");
      }
      else{
          System.out.println("Allow transaction");
      }
    }

}
