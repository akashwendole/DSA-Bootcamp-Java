// Calculate average of n numbers

import java.util.Scanner;

class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers are there : ");
        int count = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sc.nextInt() + sum;
        }
        System.out.println("The average of the numbers is : " + sum / count);
        sc.close();
    }
}
