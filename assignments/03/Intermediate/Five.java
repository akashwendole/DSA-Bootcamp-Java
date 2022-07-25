// Calculate distance between two points

import java.util.Scanner;

class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance of first point : ");
        int first = sc.nextInt();
        System.out.print("Enter the distance of second point : ");
        int second = sc.nextInt();
        int distance = first - second;
        System.out.println("Distance between two points is : " + distance);
        sc.close();
    }    
}
