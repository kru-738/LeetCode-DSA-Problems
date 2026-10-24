import java.util.Scanner;

class Solution {
    public int jump(int[] nums) 
    {        
        int jumps = 0;
        int currentEnd = 0;
        int furthest = 0;

        for(int i=0;i<nums.length-1;i++){
            
            int reach = i+nums[i];

            if(reach>furthest){
                furthest = reach;
            }

            if(i==currentEnd){
                jumps++;
                currentEnd = furthest;
            }

            if(currentEnd>=nums.length-1){
                break;
            }
        }

        return jumps;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array = ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid size!");
            sc.close();
            return;
        }

        int[] nums = new int[size];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }

        Solution s = new Solution();
        int result = s.jump(nums);

        System.out.println(result);
        sc.close();
    }
}