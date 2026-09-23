package String;


import java.util.Scanner;

public class CountVowelsConsonant {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        str = str.toLowerCase();
        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

           if(ch >= 97 && ch <= 122) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else
                     {
                    consonant++;
                }
            }
        }

        System.out.println("number of vowel " + vowel);
        System.out.println("number of consonant " + consonant);

    }
}