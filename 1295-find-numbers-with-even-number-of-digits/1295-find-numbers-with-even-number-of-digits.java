import java.util.Scanner;

class Solution {
    public int findNumbers(int[] nums) 
    {
      int count = 0;
      for(int num : nums)
      {
        if(even(num)){
            count++;
        }
      }   
      return count;
    }

    static boolean even(int num)
    {
        int noOfDigits = digit(num);
        if(noOfDigits % 2 == 0)
        {
            return true;
        }
        return false;
    }

    static int digit(int num)
    {
        if(num==0)
        {
            return 1;
        }

        if(num<0)
        {
            num=num*-1;
        }

        return (int)(Math.log10(num)+1);
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
        System.out.println("Enter the elements in the Array ");
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = sc.nextInt();
        }

        Solution s = new Solution();
        System.out.println(s.findNumbers(nums));
        sc.close();
    }
}