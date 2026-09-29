import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("What operation do u want to perform on two integers");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // taking two numbers as input
                System.out.println("Enter the 1st Integer : ");
                int num1 = input.nextInt();
                System.out.println("Enter the 2nd Integer : ");
                int num2 = input.nextInt();

                if (op == '+' ) {
                    System.out.println(num1 + num2);
                } else if (op == '-') {
                    System.out.println(num1 - num2);
                } else if (op == '*') {
                    System.out.println(num1 * num2);
                } else if (op == '/') {
                    System.out.println(num1 / num2);
                } else if (op == '%') {
                    System.out.println(num1 % num2); 
                } else {
                    System.out.println("Invalid Operation ,Enter the operation u want to perform");  
                }
                
                }
                 if (op == 'X' || op == 'x') {
                    System.out.println("Exited");
                    break;  
            }
        }
    }
}