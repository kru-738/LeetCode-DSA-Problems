import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        int count = 0;
        int currentSum = 0;

        Map<Integer, Integer> prefixSumCount = new HashMap<>();   
        prefixSumCount.put(0,1);
        
        for(int a : nums)
        {
            currentSum+=a;  

            if(prefixSumCount.containsKey(currentSum-k))
            {
                count+=prefixSumCount.get(currentSum-k);
            }

            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum,0)+1);
        }

        return count;
    }
}