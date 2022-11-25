import java.util.Scanner;

class Four {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of people :");
        // int people_size = sc.nextInt();
        // System.out.println("Enter the bank accounts they have : ");
        // int bank_size = sc.nextInt();
        // int[][] accounts = new int[people_size][bank_size];
        // for(int i = 0; i < people_size; i++) {
        //     for (int j = 0; j < bank_size; j++) {
        //         accounts[i][j] = sc.nextInt();
        //     }
        // }
        int [][] accounts = {{1,5},{7,3},{3,5}};
        System.out.print("The richest customer whelth is : " + maximumWealth(accounts));
        // sc.close();
    }    



    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] bank : accounts) {
            int total = 0;
            for (int ammount : bank) {
                total +=ammount;
            }
            if (total > max) {
                max = total;
            }
        }
        return max;
    }

}
