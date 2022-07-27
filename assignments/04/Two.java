// Define a program whether the given number is even or odd.

import java.util.Scanner;

class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(even_odd(num));
        sc.close();
    }

    static boolean even_odd(int num) {
        return num % 2 == 0;
    }
}
