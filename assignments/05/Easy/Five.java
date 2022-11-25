import java.util.Arrays;
import java.util.Scanner;

class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array in even numbers : ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers : ");
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // int[] arr = {2,5,1,3,4,7};
        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        if (size % 2 == 0) {
            System.out.println(Arrays.toString(shuffle(arr, n)));
        }
        else {
            System.out.println("Enter the size in even numbers.");
        }
    }    


    static int[] shuffle(int[] nums, int n) {
        int[] result = new int[n*2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            result[count] = nums[i];
            result[count+1] = nums[i+n];
            count+=2;
        }
        return result;
    }
}
