import java.util.Scanner;

class Two {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and height of triangle");
        System.out.print("Base");
        int base = sc.nextInt();
        System.out.print("Height");
        int height = sc.nextInt();
        float area = (float) (0.5 * base * height);
        System.out.println("The area of the triangle is : " + area);
        sc.close();
    }    
}
