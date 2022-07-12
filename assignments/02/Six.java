import java.util.Scanner;

class Six {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the currency in Rupees:");
        float rupee = sc.nextFloat();
        float dollar = rupee / 70;
        System.out.println(rupee + " in dollar is " + dollar);
        sc.close();
    }    
}
