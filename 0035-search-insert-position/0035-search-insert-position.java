import java.util.Scanner;
class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int low = 0;
        int high = nums.length-1;

        while(low<=high){

            int mid = low + (high-low)/2;

            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        } 

        return low;   
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid Choice!");
            sc.close();
            return;
        }

        int[] nums = new int[size];
        System.out.println("Enter the elements of an Array ");
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target element ");
        int target = sc.nextInt();

        Solution s = new Solution();
        int result = s.searchInsert(nums,target);

        System.out.println(result);
        sc.close();
    }
}