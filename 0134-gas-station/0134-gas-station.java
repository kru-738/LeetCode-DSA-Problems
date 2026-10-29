import java.util.Scanner;
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) 
    {
        int gasSum = 0;
        int costSum = 0;
        for(int i=0;i<gas.length;i++){
            gasSum+=gas[i];
            costSum+=cost[i];
        }
        if(gasSum<costSum){
            return -1;
        }
        int totalGas = 0;
        int startPoint = 0;
        for(int i=0;i<gas.length;i++){
           totalGas += gas[i]-cost[i];
           if(totalGas<0){
            startPoint = i+1;
            totalGas = 0;
           }     
        }

        return startPoint;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array ");
        int size = sc.nextInt();
        
        if(size<=0){
        System.out.println("Invalid Choice!");
        sc.close();
        return;
        }

        int[] gas = new int[size];
        int[] cost = new int[size];
        System.out.println("Enter the gas elements = ");
        for(int i=0;i<gas.length;i++){
            gas[i] = sc.nextInt();
        }
        System.out.println("Enter the gas Cost = ");
        for(int i=0;i<cost.length;i++){
            cost[i] = sc.nextInt();
        }
        
        Solution s = new Solution();
        int result = s.canCompleteCircuit(gas,cost);

        System.out.println(result);
        sc.close();
    }

}