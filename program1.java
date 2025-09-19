import java.util.Scanner;

class AddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to take input
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2; // Add two numbers
        System.out.println("The sum is: " + sum);

        sc.close(); // Close the scanner
    }
}
