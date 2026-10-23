import java.util.Scanner;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
         int i=0, j=0, k=0;
         int size3 = nums1.length + nums2.length;

         int[] nums3 = new int[size3];
         
         while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                nums3[k++] = nums1[i++];
            }else
            {
                nums3[k++] = nums2[j++];
            }
         }

         while(i<nums1.length){
            nums3[k++] = nums1[i++];
         }

         while(j<nums2.length){
            nums3[k++] = nums2[j++];
         }

         double median;
         if(size3%2==0){
            median = (nums3[size3/2-1] + nums3[size3/2]) / 2.0;
         }else{
            median = nums3[size3/2];
         }

         return median;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an First Element");
        int size1 = sc.nextInt();
        System.out.println("Enter the size of an Second Element");
        int size2 = sc.nextInt();

        if(size1<=0 || size2<=0){
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        int[] nums1 = new int[size1];
        System.out.println("Enter the elements of an First Array ");
        for(int i=0;i<nums1.length;i++){
            nums1[i] = sc.nextInt();
        }

        int[] nums2 = new int[size2];
        System.out.println("Enter the elements of an Second Array ");
        for(int j=0;j<nums2.length;j++){
            nums2[j] = sc.nextInt();
        }

        Solution s = new Solution();
        double result = s.findMedianSortedArrays(nums1,nums2);

    }
}