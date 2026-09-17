package Statements;

import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a = sc.nextInt();
        System.out.println("Enter the value of B");
        int b = sc.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");

        System.out.println("input choice");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Addition " + (a+b));
                break;
                case 2:
                    System.out.println("Subtraction" + (a-b));
                    break;
                    case 3:
                        System.out.println("Multiplication"  + (a*b));
                        break;
                        case 4:
                            System.out.println("Division "  +  a/b);
                            break;
                            default:

                                System.out.println("invalid choice");
        }
    }
}