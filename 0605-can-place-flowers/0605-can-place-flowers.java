import java.util.Scanner;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
        int count=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                boolean leftEmpty = (i==0) || (flowerbed[i-1]==0);
                boolean rightEmpty = (i==flowerbed.length-1) || (flowerbed[i+1]==0);

                if(leftEmpty && rightEmpty){
                    flowerbed[i]=1;
                    count++;
                }

                if(count>=n){
                    return true;
                }
            }
        }
        return false;
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

        int[] flowerbed = new int[size];
        System.out.println("Enter the elements in the Array ");
        for(int i=0;i<flowerbed.length;i++){
            flowerbed[i] = sc.nextInt();
        }

        System.out.println("Enter the no of flowers to plant ");
        int n = sc.nextInt();

        Solution s = new Solution();
        boolean result = s.canPlaceFlowers(flowerbed,n);


        System.out.println(result);
        sc.close();
    }
}