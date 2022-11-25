import java.util.ArrayList;
import java.util.Scanner;

class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of person : ");
        int n = sc.nextInt();
        System.out.println("Enter the number of candies : ");
        int[] candies = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }
        System.out.print("Enter the number of extra candies : ");
        int extraCandies = sc.nextInt();
        System.out.println(kidsWithCandies(candies, extraCandies));
    }    


    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<Boolean>(candies.length);
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);
        }
        return result;
    }
}
