class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSum = nums[0];
        int currentSum = nums[0];

        for(int i=1;i<nums.length;i++){
            if(currentSum<0){
                currentSum = nums[i];
            }else{
                currentSum+=nums[i];
            }

            if(currentSum>maxSum){
                maxSum = currentSum;
            }
        }
        return maxSum;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array = ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("The Array size should be greater than 0");
            sc.close();
            return;
        }

        int[] a = new int[size];
        System.out.println("Enter the elements of an Array ");

        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        Solution s = new Solution();
        int result = s.maxSubArray(a);

        System.out.println("The Maximum Subarray "+result);
        sc.close();
    }
}