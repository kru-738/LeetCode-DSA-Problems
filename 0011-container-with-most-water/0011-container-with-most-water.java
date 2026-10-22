import java.util.Scanner;

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max_water = 0;

        while(left<right){
            int width = right - left;
            int minHeight = Math.min(height[left],height[right]);
            int current_water = width*minHeight;

            if(max_water<current_water){
                max_water = current_water;
            }

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }

        return max_water;
        
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array = ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid Choice!");
            sc.close();
            return;
        }

        int[] height = new int[size];
        System.out.println("Enter the elements of an Array ");
        for(int i=0;i<height.length;i++){
            height[i] = sc.nextInt();
        }

        Solution s = new Solution();
        int result = s.maxArea(height);

        System.out.println(result);
    }
}