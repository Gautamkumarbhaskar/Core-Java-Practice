package StringExample;

public class trim {
    public static void main (String[] args){
        String str1 = "       The Sky   ";
        str1.trim();
        System.out.println(str1);
        str1=str1.trim();
        System.out.println(str1);
    }

}
