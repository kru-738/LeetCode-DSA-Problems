import java.util.Scanner;

class Solution {
    public boolean canJump(int[] nums) 
    {
        int furthest = 0;
        for(int i=0;i<nums.length;i++){

            int reach = i+nums[i];

            if(i>furthest){
                break;
            }

            if(reach>furthest){
                furthest = reach;
            }

            if(furthest>=nums.length-1){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array =  ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        int[] nums = new int[size];
        System.out.println("Enter the elements of an Array ");
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }

        Solution s = new Solution();
        boolean result = s.canJump(nums);

        System.out.println(result);
    }
}