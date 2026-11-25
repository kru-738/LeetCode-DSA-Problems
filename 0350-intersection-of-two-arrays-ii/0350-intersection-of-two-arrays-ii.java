import java.util.ArrayList;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i:nums2)
        {
            list1.add(i);
        }   

        ArrayList<Integer> intersectedArray = new ArrayList<>();
        for(int i:nums1)
        {
            if(list1.contains(i))
            {
                intersectedArray.add(i);

                list1.remove(Integer.valueOf(i));
            }
        }


        int[] result = new int[intersectedArray.size()];
        for(int i=0;i<intersectedArray.size();i++)
        {
            result[i] = intersectedArray.get(i);
        }

        return result;
    }
}