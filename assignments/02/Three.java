import java.util.Scanner;

class Three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle ammount, rate of intrest and time:");
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        int si = (p*r*t)/100;
        System.out.print("Simple intrest is: " + si);
        sc.close();
    }    
}
