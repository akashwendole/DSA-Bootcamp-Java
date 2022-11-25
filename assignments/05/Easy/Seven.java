import java.util.Scanner;

class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array.");
        int size = sc.nextInt();
        System.out.println("Enter the numbers:");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(numIdenticalPairs(nums));
    }    


    static int numIdenticalPairs(int[] nums) {
        int counter = 0; 
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
