package Statements;

import java.util.Scanner;

public class MembershipDiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter purchase amount");
        double purchase = sc.nextInt();
        System.out.println("Member type (premium or regular)");
        String memberType = sc.next();
        if (purchase > 50000 && memberType.equals("premium")) {
            purchase = purchase - (purchase / 100 * 25);
            System.out.println("total payable amount  " + purchase);

        } else if (purchase > 50000 && memberType.equals("regular")) {
            purchase = purchase - (purchase / 100 * 15);
            System.out.println("total payable amount  " + purchase);

        } else if (20000 < purchase && purchase < 49999 && memberType.equals("premium")) {
            purchase = purchase - (purchase / 100 * 15);
            System.out.println("Total payable amount  " + purchase);
        } else if (20000 < purchase && purchase < 49999 && memberType.equals("regular")) {
            purchase = purchase - (purchase / 100 * 10);
            System.out.println("Total payable amount  " + purchase);

        } else if (purchase < 20000 && memberType.equals("premium")) {
            purchase = purchase - (purchase / 100 * 5);
            System.out.println("Total payable amount  " + purchase);


        }


            else if(purchase < 20000 && memberType.equals("regular")) {
            System.out.println("no discount " + purchase);
        }

         else {
            System.out.println("invalid input");
              }


        }

    }






