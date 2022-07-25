// Factorial program 
// logic :- 
// Factorial of 4 = 4 * 3 * 2 * 1 = 24

import java.util.Scanner;

class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.print("Factorial of " + num + " is " + factorial);
        sc.close();
    }
}
