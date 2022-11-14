// Build Array from Permutation

import java.util.Scanner;
import java.util.Arrays;

class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();
        System.out.println("Enter the numbers: ");
        int[] arr = new int[length];
        for(int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(buildArray(arr)));
        sc.close();
    }
    
    static int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}


// class Solution {
//     public int[] buildArray(int[] nums) {
//         int ans[] = new int[nums.length];
//         for (int i = 0; i < nums.length; i++) {
//             ans[i] = nums[nums[i]];
//         }
//         return ans;
//     }
// }