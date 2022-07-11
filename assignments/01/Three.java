import java.util.Scanner;

class Three {
    public static void main(String[] args){
        System.out.print("Enter the number for multiplication table: ");
        Scanner sc = new Scanner(System.in);
        int mul = sc.nextInt();
        for(int i=1; i<11; i++){
            System.out.println(mul + "*" + i + "=" + mul*i);
        }
    }
}
