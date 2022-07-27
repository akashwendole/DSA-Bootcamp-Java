// Write a program to print the factorial of a number by defining a method named 'Factorial'.

import java.util.Scanner;

class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("The factorial of the given number is " + factorial(num));
        sc.close();
    }

    static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }
}
