import java.util.Arrays;
import java.util.Scanner;

class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers : ");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }    


    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            int counter = 0;
            for (int j = 0; j < result.length; j++) {
                if (nums[i] > nums[j]) {
                    counter++;
                }
            }
            result[i] = counter;
        }
        return result;
    }
}
