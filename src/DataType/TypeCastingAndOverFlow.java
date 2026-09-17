package DataType;

public class TypeCastingAndOverFlow {
    public static void main(String[]args){
        int myInt = 100;
        double myDouble = myInt;
        System.out.println("widening(int to double) : " + myDouble);
        double decimalval = 99.85;
        int convertInt = (int)decimalval;
        byte b =127;
        b++;
        System.out.println("Byte overflow Result (127 +1):" + b);
        byte minB = -128;
        minB--;
        System.out.println("Byte underflow Result(-128-1): " + minB);



    }
}
