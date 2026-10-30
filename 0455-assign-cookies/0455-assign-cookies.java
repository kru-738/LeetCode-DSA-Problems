import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int findContentChildren(int[] g, int[] s) 
    {
        Arrays.sort(g);
        Arrays.sort(s);  
        int childPtr = 0;
        int cookiePtr = 0;

        while(childPtr<g.length && cookiePtr<s.length)
        {
            if(g[childPtr]<=s[cookiePtr])
            {
                childPtr++;
            }
            cookiePtr++;
        } 

        return childPtr;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an child Array ");
        int size1 = sc.nextInt();
        if(size1<=0){
            System.out.println("Invalid Size!");
            sc.close();
            return;
        }

        int[] g = new int[size1];
        System.out.println("Enter the elements in the child Array ");
        for(int i=0;i<g.length;i++){
            g[i] = sc.nextInt();
        }

        System.out.println("Enter the size of an cookie Array ");
        int size2 = sc.nextInt();
        if(size2<=0){
            System.out.println("Invalid size!");
            sc.close();
            return;
        }

        int[] s = new int[size2];
        System.out.println("Enter the elements in the cookie Array ");
        for(int i=0;i<s.length;i++){
            s[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int result = sol.findContentChildren(g,s);
        System.out.println(result);
    }
}