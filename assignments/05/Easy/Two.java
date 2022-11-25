import java.util.Arrays;
import java.util.Scanner;

class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        System.out.println("Enter the array:");
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = getConcatination(arr, size);
        System.out.println(Arrays.toString(result));
    }    


    static int[] getConcatination(int[] nums, int size) {
        int[] result = new int[size*2];
        for (int i = 0; i < size; i++) {
            result[i] = nums[i];
            result[i + size] = nums[i];
        }
        return result;
    }
}
