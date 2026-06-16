import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.println("========================================");
        System.out.println("        NUMBER COMPARISON TOOL     ");
        System.out.println("========================================\n");

        System.out.print(" [+] Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print(" [+] Enter the second number: ");
        double num2 = sc.nextDouble();
            
        if (num1 > num2) {
            System.out.printf(" [RESULT] The larger number is: %.2f\n", num1);
        } else if (num2 > num1) {
            System.out.printf(" [RESULT] The larger number is: %.2f\n", num2);
        } else {
            System.out.println(" [RESULT] Both numbers are equal.");
        }    
        sc.close();
    }
}