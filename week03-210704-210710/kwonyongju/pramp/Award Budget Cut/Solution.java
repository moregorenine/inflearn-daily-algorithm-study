import java.util.Arrays;

public class Solution{
    
    public static double findGrantsCap(double[] grantsArray, double newBudget) {
        int len = grantsArray.length;
        double preSum = 0;

        Arrays.sort(grantsArray);

        for (int i = 0; i < len; ++i) {
            double cur = grantsArray[i];
            double available = newBudget - preSum;
            int numLeft = len - i;

            // check if remaining budget can cover cur * numLeft
            if (cur * numLeft > available) return available / numLeft;

            preSum += cur;
        }

        return grantsArray[len - 1];
    }

     public static void main(String []args){
     double[] grantsArray = new double[]{17, 13, 0, 200, 500};
        double newBudget = 54d;

        System.out.println(findGrantsCap(grantsArray, newBudget));
     }
}