// Define a method to find out if a number is prime or not.

import java.util.Scanner;

class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(prime(num));
        sc.close();
    }

    static boolean prime(int num) {
        int count = 2;
        while(count * count <= num) {
            if (num % count == 0) {
                return false;
            }
            count += 1;
        }
        return true;
    }
}
