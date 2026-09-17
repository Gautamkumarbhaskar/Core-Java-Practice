
import java.util.Scanner;
public class ConvertInEmi {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a principle amount");
        int pa= sc.nextInt();
        System.out.println("Enter a tenure in year");
        double ty = sc.nextDouble();
        System.out.println("Enter a interest rate in year ");
        double iy = sc.nextDouble();
        Double temp1 = ty * 12;
        Double temp2 = iy / 12 /100;

        double temp3 = Math.pow(1+temp2 , temp1);

        double temp4 = (pa * temp2 * temp3)/(temp3 -1);

        System.out.println(temp4 +  " Emi per month ");
          sc.close();
    }

}
