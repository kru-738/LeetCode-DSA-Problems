import java.util.Scanner;

class Solution {
    public int pivotIndex(int[] nums) 
    {
     int totalSum = 0;
      
      for(int a:nums)
      {
        totalSum+=a;
      }     

      int leftSum = 0;
      for(int i=0;i<nums.length;i++)
      {
        int rightSum = totalSum - leftSum - nums[i];

        if(rightSum == leftSum)
        {
            return i;
        }

        leftSum +=nums[i];
      }

      return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array ");
        int size = sc.nextInt();

        if(size<=0)
        {
            System.out.println("Invalid size!");
            sc.close();
            return;
        }

        int[] nums = new int[size];
        System.out.println("Enter the element in the array ");
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = sc.nextInt();
        }

        Solution s = new Solution();
        int result = s.pivotIndex(nums);

        System.out.println(result);
        sc.close();
    }
}