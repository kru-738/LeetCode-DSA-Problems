class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int a:nums)
        {
            set.add(a);
        }

        int largestStreak = 0;
        for(int i:set)
        {
            if(!set.contains(i-1))
            {
                int currentNum = i;
                int currentStreak = 1;

                while(set.contains(currentNum+1))
                {
                    currentNum++;
                    currentStreak++;
                }

                largestStreak = Math.max(largestStreak,currentStreak);
            }
        }
        return largestStreak;
    }
}