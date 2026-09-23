package String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String reverse ="";

          //reverse the string
        for(int i = str.length()-1; i>=0; i--) {
            reverse += str.charAt(i);


        }
        if (str.equals(reverse)) {
            System.out.println(" it is palindrome");
        }
            else {
            System.out.println("it is not a palindrome");
        }



        }

    }


