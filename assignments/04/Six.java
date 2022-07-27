// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;

class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        int radius = sc.nextInt();
        System.out.println("Circumference of the circle is " + circum(radius));
        System.out.println("Area of the circle is " + area(radius));
        sc.close();
    }

    static float circum(int radius){
        return (float) (2 * 3.14 * radius);
    }

    static float area(int radius) {
        return (float) (3.14 * radius* radius);
    }
}
