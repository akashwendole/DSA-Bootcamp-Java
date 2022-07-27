// Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(palindrome(num));
        sc.close();
    }

    static int reverse(int num) {
        int rem, num2 = 0;
        while (num != 0) {
            rem = num % 10;
            num2 = num2 * 10 + rem;
            num = num / 10;
        }
        return num2;
    }

    static boolean palindrome(int num) {
        int num2 = reverse(num);
        int count = 0;
        while (num != 0) {
            if (num % 10 != num2 % 10) {
                return false;
            }
            num = num / 10;
            num2 = num2 / 10;
        }
        return true;
    }
}
