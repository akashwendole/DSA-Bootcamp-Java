import java.util.Arrays;
import java.util.Scanner;

class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        System.out.println("Enter the array:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(runningSum(arr, size)));
    }    


    static int[] runningSum(int[] nums, int size) {
        for (int i = 1; i < size; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}
