import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) 
    {
        Arrays.sort(intervals, (x,y) -> Integer.compare(x[1],y[1]));

        int[] currentInterval = intervals[0];

        int count = 0;

        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]>=currentInterval[1])
            {
                currentInterval = intervals[i];
            }else{
                count++;
            }
        }  
        return count;
    }
}