import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        int num = 234;
        int num2 = 0;
        int rem;
        while (num != 0) {
            // System.out.println(num % 10);
            // num = num/10;
            rem = num % 10;
            num2 = num2 * 10 + rem;
            num = num / 10;
        }
        System.out.println(num2);
        // num = -num;
        // while (num <= 0) {
        //     System.out.println(num % 10);
        //     num = num/10;
        // }        
    }    
}
