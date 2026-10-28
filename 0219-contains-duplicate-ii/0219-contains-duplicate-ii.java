import java.util.Scanner;
import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
       HashSet<Integer> set = new HashSet<>();
       for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i])){
            return true;
        }else{
            set.add(nums[i]);
        }
        if(i>=k){
            set.remove(nums[i-k]);
        }
   
       }   
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array = ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("invalid Choice!");
            sc.close();
            return;
        }

        int[] nums = new int[size];
        System.out.println("Enter the elements in the array = ");
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target ");
        int k = sc.nextInt();

        Solution s = new Solution();
        boolean result = s.containsNearbyDuplicate(nums,k);

        System.out.println(result);
    }
}