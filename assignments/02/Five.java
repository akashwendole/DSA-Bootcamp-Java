import java.util.Scanner;

class Five {
    public static void main(String[] args){
        System.out.println("Enter the two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc. nextInt();
        if(a<b){
            System.out.println(b + " is the largest number");
        }
        else{
            System.out.println(a + " is the largest number");
        }
        sc.close();

    }
}
