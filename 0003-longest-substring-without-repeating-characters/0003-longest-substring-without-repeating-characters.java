import java.util.Scanner;
import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s)
    {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for(int i=0;i<s.length();i++)
        {
            while(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(i));
            maxLength = Math.max(maxLength, i-left+1);
        }

        return maxLength;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();

        if(s.isEmpty()){
            System.out.println("The string is empty!");
            sc.close();
            return;
        }

        Solution sol = new Solution();
        int result = sol.lengthOfLongestSubstring(s);

        System.out.println(result);
        sc.close();

    }
}