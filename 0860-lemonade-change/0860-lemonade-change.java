import java.util.Scanner;

class Solution {
    public boolean lemonadeChange(int[] bills)
    {
        int five=0;
        int ten=0;
        
        for(int bill : bills)
        {
            if(bill==5){
                five++;
            }else if(bill==10){
                if(five>0){
                    five--;
                    ten++;
                }else{
                    return false;
                }
            }else {
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }else if(five>=3){
                    five-=3;
                }else{
                    return false;
                    
                }
            }
        }
        return true;
        
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid size!");
            sc.close();
            return;
        }

        int[] bills = new int[size];

        Solution s = new Solution();
        boolean result = s.lemonadeChange(bills);
        System.out.println(result);
    }
}