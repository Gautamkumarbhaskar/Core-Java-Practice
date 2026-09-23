package StringExample;

public class equalsIgnorecase {
    public static void main (String[] args){
        String str1=new String("Vivo");
        String str2= new String("vivo");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }

}
