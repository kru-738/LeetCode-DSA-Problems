import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int findMinArrowShots(int[][] points) {
        
        if (points == null || points.length == 0) {
            return 0;
        }

        
        Arrays.sort(points, (x, y) -> Integer.compare(x[1], y[1]));

        int arrows = 1;
        int arrowsPos = points[0][1];

        
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > arrowsPos) {
                arrows++;
                arrowsPos = points[i][1];
            }
        }
        return arrows;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array = ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid size!");
            sc.close();
            return;
        }

        int[][] points = new int[size][2];
        System.out.println("Enter the elements in the array ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        Solution s = new Solution();
        int result = s.findMinArrowShots(points);

        System.out.println("Minimum arrows needed: " + result);
        sc.close();
    }
}