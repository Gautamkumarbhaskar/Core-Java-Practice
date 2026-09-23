package StringExample;

public class replace {
    public static void main(String[]args){
        String str = "The cat sat on mat.my cat is cute.";
                String newstr = str.replace("cat","dog");
        System.out.println(str);
        System.out.println("After replace : "+newstr);
    }
}
