package StringExample;

public class Replacealldigit {
    public static void main() {
        String str1 = "ram";
        String str2= new String("Ram");
        str2 = str2.toLowerCase();
        str1 = str1.toUpperCase();
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));



    }
}
