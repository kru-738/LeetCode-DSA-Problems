class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> seen = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!seen.add(nums[i])){
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid size!");
            sc.close();
            return;
        }

        System.out.println("Enter the elements = ");
        int[] nums = new int[size];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }

        Solution s = new Solution();
        boolean result = s.containsDuplicate(nums);

        System.out.println(result);

        sc.close();
    }
}