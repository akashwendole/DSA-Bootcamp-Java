// Define two methods and print maximum and minimum respectivelyamong three numbers entered by the user.

import java.util.Scanner;

class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Largest number is : " + maximum(a, b, c));
        System.out.println("Smallest number is : " + minimum(a, b, c));
        sc.close();
    }


    static int maximum(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }

        else if (b > a && b > c) {
            return b;
        }

        else if (c > a && c > b) {
            return c;
        }
        return 0;
    }


    static int minimum(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }

        if (b < a && b < c) {
            return b;
        }

        if (c < a && c < b) {
            return c;
        }
        return 0;
    }
}