import java.util.Scanner;

class Solution {
    public int majorityElement(int[] nums) 
    {
        int count = 0;
        int candidate = 0;
        for(int a: nums)
        {
            if(count==0)
            {
                candidate = a;
            }
            if(a == candidate)
            {
                count++;
            }else
            {
                count--;
            }
        }   

        int actualCount = 0;
        for(int a : nums)
        {
            if(a==candidate)
            {
                actualCount++;
            }
        }

        if(actualCount>nums.length/2)
        {
            return candidate;
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
        System.out.println("Enter the elements in the array ");
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = sc.nextInt();
        }

        Solution s = new Solution();
        int result = s.majorityElement(nums);
        System.out.println(result);
        sc.close();
    }
}