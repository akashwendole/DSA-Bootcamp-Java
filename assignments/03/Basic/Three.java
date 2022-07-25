import java.util.Scanner;

class Three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width of rectangle.");
        System.out.print("Length:");
        int length = sc.nextInt();
        System.out.print("Width:");
        int width = sc.nextInt();
        int area = length * width;
        System.out.println("Area of rectangle is : " + area);
        sc.close();
    }
}
