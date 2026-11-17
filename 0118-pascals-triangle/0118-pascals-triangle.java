import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<numRows;i++)
        {
            list.add(new ArrayList<>());
        }   

        for(int i=0;i<numRows;i++)
        {
            int sum =0;
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    list.get(i).add(1);
                }else
                {
                    sum = list.get(i-1).get(j-1) + list.get(i-1).get(j);
                    list.get(i).add(sum);
                }
            }
        }

        return list;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows ");
        int numRows = sc.nextInt();

        if(numRows==0)
        {
            System.out.println("Invalid size!");
            sc.close();
            return;
        }

        Solution s =  new Solution();
        List<List<Integer>> result = s.generate(numRows);

        System.out.println(result);
        sc.close();
    }
}