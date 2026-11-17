import java.util.Scanner;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++)
        {
            int wealth = 0;
            for(int j=0;j<accounts[i].length;j++)
            {
               wealth = wealth+accounts[i][j]; 
            }

            if(wealth>maxWealth)
            {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the rows ");
        int rows = sc.nextInt();
        System.out.println("Enter the size of the column ");
        int col = sc.nextInt();

        if(rows<=0 || col<=0)
        {
            System.out.println("Invalid size!");
            sc.close();
            return;
        }

        int[][] accounts = new int[rows][col];
        System.out.println("Enter the elements in the array ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                accounts[i][j] = sc.nextInt();
            }
        }

        Solution s = new Solution();
        System.out.println(s.maximumWealth(accounts));
        sc.close();
    }
}