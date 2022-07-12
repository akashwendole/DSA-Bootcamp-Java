import java.util.Scanner;

class Four {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter the operation (+,-,*,/)");
        char operation = sc.next().charAt(0);
        if(operation=='+'){
            result = a + b;
            System.out.println("Addition of two numbers is " + result);
        }
        else if(operation=='-'){
            result = a - b;
            System.out.println("Substraction of two numbers is " + result);
        }
        else if(operation=='*'){
            result = a * b;
            System.out.println("Multiplication of two numbers is " + result);
        }
        else if(operation=='/'){
            result = a - b;
            System.out.println("Division of two numbers is " + result);
        }
        else{
            System.out.println("Enter the correct operation.");
        }
        sc.close();
    }
}
