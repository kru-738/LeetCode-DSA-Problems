import java.util.Scanner;

class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int totalWater = 0;

        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=leftMax){
                leftMax = height[left];
                }
              else{
                totalWater += leftMax - height[left];
              }
              left++;
            }

            else{
                if(height[right] >= rightMax){
                   rightMax = height[right];
                }
                else{
                    totalWater += rightMax - height[right];
                }
                right--;
            }

            
            
        }
        return totalWater;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        int[] height = new int[size];
        System.out.println("Enter the elements of an Array ");
        for(int i=0;i<height.length;i++){
            height[i] = sc.nextInt();
        }

        Solution s = new Solution();
        int result = s.trap(height);

        System.out.println(result);
        
        sc.close();
    }
}