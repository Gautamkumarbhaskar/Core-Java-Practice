package StringExample;

public class toCharArray {
    public static void main (String[] args){
        String str="Apple";
        char[] chars = str.toLowerCase().toCharArray();
        System.out.println(chars[2]);
        System.out.println(chars[chars.length-1]);
    }
}
