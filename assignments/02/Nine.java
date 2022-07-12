import java.util.Scanner;

class Nine {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
            int temp = i;
            int hundreds = temp / 100;
            temp = (hundreds * 100) - i;
            int tens = temp /10;
            temp = (tens * 10) - i;
            int ones = temp;
            temp = (hundreds*hundreds*hundreds) + (tens*tens*tens) + (ones * ones * ones);
            if(temp == i){
                System.out.println(temp + " is a armstrong number.");
            }
            System.out.println(tens);
        }
        sc.close();
    }    
}
