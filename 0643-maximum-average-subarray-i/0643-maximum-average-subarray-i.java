import java.util.Scanner;
class Solution {
    public double findMaxAverage(int[] nums, int k)
    {
        int CurrentWindowSum = 0;
        for(int i=0;i<k;i++){
            CurrentWindowSum+=nums[i];
        }    
        double MaxWindowSum = CurrentWindowSum;
        for(int i=k;i<nums.length;i++){
            CurrentWindowSum += nums[i]-nums[i-k];
            if(CurrentWindowSum>MaxWindowSum){
                MaxWindowSum = CurrentWindowSum;
            }
        }

        double maxAvg = MaxWindowSum/k;
        return maxAvg;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid Size!");
            sc.close();
            return;
        }

        int[] nums = new int[size];
        System.out.println("Enter the elements of an Array ");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println("Enter the target element ");
        int  k = sc.nextInt();
        if(k>size || k<=0){
            System.out.println("Invalid Element!");
            sc.close();
            return;
        }

        Solution s = new Solution();
        double result = s.findMaxAverage(nums,k);

        System.out.println(result);
    }
}