import java.util.Scanner;

class Solution {
    public void moveZeroes(int[] nums) 
    {        
        int tracker = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[tracker] = nums[i];
                tracker++;
            }
        }

        while(tracker<nums.length){
            nums[tracker] = 0;
            tracker++;
        }

    
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid size!");
            sc.close();
            return;
        }

         int[] nums = new int[size];
         System.out.println("Enter the Array elements = ");
         for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
         }

         Solution s = new Solution();
          s.moveZeroes(nums);

          for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
          }

          sc.close();
    }
}