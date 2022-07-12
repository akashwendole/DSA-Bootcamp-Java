import java.util.Scanner;

class Two {
    public static void main(String[] args){
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = sc.next();
        System.out.println("Hello " + name + "! Have a nice day.");
        sc.close();
    }    
}
