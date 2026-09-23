package StringExample;

public class Substring {
   public static void main(String[] args) {
       String str="The Sky is blue";
       //start index:4
       //stop index:7
       //The substring is returned between startindx to stopindex-1
       //start index:8
       //The substring is rrturned from startindex to end of the string

       String output =str.substring(8);
       System.out.println(output);


    }
}
