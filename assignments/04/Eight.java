// Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

import java.util.Scanner;

class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int marks = sc.nextInt();
        System.out.print("The grade for the marks entered is " + grade(marks));
        sc.close();
    }

    static String grade(int marks) {
        if (marks > 90) {
            return "AA";
        }

        else if (marks > 80) {
            return "AB";
        }

        else if (marks > 70) {
            return "BB";
        }

        else if (marks > 60) {
            return "BC";
        }

        else if (marks > 50) {
            return "CD";
        }

        else if (marks > 40) {
            return "DD";
        }

        else {
            return "FAIL";
        }
    }
}
