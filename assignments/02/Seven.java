import java.util.Scanner;

class Seven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int fibo = 1;
        int temp = 0;
        int temp2 = 0;
        for(int i=0;i<n-1;i++){
            temp2 = fibo;
            fibo = temp + fibo;
            temp = temp2;
        }
        System.out.println("Fibonacchi series of " + n + " is:" + fibo);
        sc.close();
    }   
}
