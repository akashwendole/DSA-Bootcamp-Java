// Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The product of two numbers is : " + product(a, b));
        sc.close();
    }    

    static int product(int num1, int num2) {
        return num1 * num2;
    }
}
