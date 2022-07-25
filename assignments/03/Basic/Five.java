// area of paralleglogram = base * height


import java.util.Scanner;

class Five {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height of parallelogram.");
        System.out.print("Base:");
        int base = sc.nextInt();
        System.out.print("Height:");
        int height = sc.nextInt();
        int area = base * height;
        System.out.println("The area of parallelogram is : " + area);
        sc.close();
    }
}
