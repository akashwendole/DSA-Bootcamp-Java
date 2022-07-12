import java.util.Scanner;

class Eight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean palindrome = true;
        System.out.print("Enter the string:");
        String s = sc.next();
        int n = s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)==s.charAt(n-i-1)){
                palindrome = true;
                continue;
            }
            else{
                palindrome = false;
                break;
            }
        }
        if(palindrome){
            System.out.println(s + " is palindrome.");
        }
        else{
            System.out.println(s + " is not palindrome.");
        }
        sc.close();
    }    
}
