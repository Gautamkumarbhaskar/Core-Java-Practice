package PracticeQuestion;

import java.util.Scanner;

public class Vowel {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch = sc.next().charAt(0);

        switch (ch){
           //  lowercase
            case ('a'):
            case ('e'):
            case('i'):
            case('o'):
            case('u'):
                //uppercase
            case('A'):
            case('E'):
            case('I'):
            case('O'):
            case('U'):
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is a consonant");

        }
    }
}
