// Electricity bill
// formulae = unit * rate

import java.util.Scanner;
class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit of the electricity bill : ");
        int unit = sc.nextInt();
        int rate = 7;
        System.out.println("Electricty bill is : " + unit * rate);
        sc.close();
    }
}
