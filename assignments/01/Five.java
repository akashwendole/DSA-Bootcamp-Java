import java.util.Scanner;

class Five {
    public static void main(String[] args){
        int sum = 0;
        boolean y = false;
        while(y==false){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number:");
            int num = sc.nextInt();
            sum = sum + num;
            System.out.print("Enter x to exit or enter other character to continue:");
            char c = sc.next().charAt(0);
            if(c=='x'){
                y = true;
                System.out.print("Sum of all the numbers is: " + sum);
            }
            sc.close();
        }
    }    
}
