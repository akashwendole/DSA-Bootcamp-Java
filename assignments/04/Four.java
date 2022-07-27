// Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum of two numbers is : " + sum(a,b));
        sc.close();
    }    

    static int sum(int a, int b) {
        return a + b;
    }
}
