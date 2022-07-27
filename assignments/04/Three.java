// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of the person : ");
        int age = sc.nextInt();
        System.out.println(check_age(age));
        sc.close();
    }    

    static boolean check_age(int age) {
        return age >= 18;
    }
}
