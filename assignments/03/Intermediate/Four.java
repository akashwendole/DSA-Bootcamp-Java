// Calculate discount of Product
// 

import java.util.Scanner;

class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the discount percentage : ");
        float percentage = sc.nextInt();
        System.out.print("Enter the price of the product : ");
        float price = sc.nextInt();
        float discountedPrice = (float) (percentage / 100 * price);
        System.out.println("Discounted Price is : " + discountedPrice);
        sc.close();
    }    
}
