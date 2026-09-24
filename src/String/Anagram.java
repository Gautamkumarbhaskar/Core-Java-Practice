package String;

import java.util.Arrays;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        System.out.println("Enter the String1");
        String str1 = sc.nextLine();

        if (str.length() == str1.length()) {
            str.toLowerCase();
            str1.toLowerCase();

            char[] arr = str.toCharArray();
            char[] arr1 = str1.toCharArray();
            Arrays.sort(arr);
            Arrays.sort(arr1);

            if (Arrays.equals(arr, arr1)) {
                System.out.println("It is an Anagram ");
            } else {
                System.out.println("it is not an Anagram");
            }

        }
    }

}

