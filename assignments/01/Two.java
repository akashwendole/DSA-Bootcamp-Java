import java.util.Scanner;

class Two{
    public static void main(String[] args){
        System.out.println("Enter the two numbers:");
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + sum + ".");
        sc.close();
    }
}