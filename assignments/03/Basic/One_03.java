import java.util.Scanner;

class One_03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        float radius = sc.nextFloat();
        float area = (float) (radius * radius * 3.17);
        System.out.println("The area of circle is : " + area);
        sc.close();
    }
}