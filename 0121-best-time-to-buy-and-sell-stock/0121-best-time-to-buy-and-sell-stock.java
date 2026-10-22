class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int currentProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }else{
                currentProfit = prices[i] - minPrice;
            }

            if(currentProfit>maxProfit){
                maxProfit = currentProfit;
            }
        }

        return maxProfit;
    }

    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of an Array = ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid size!");
            sc.close();
            return;
        }

        int[] a = new int[size];
        System.out.println("Enter the array Elements = ");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        Solution s = new Solution();
        int result = s.maxProfit(a);

        System.out.println("The maximun Profit "+result);
    }
}