import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     
    System.out.println("Enter the value of num1 "); 
    Float num1 = input.nextFloat();
    System.out.println("Enter th value of num2 ");
    Float num2 = input.nextFloat();

    int sum = (int)(num1 + num2);
    System.out.println("Sum : " + sum);
}
 }