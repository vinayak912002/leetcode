import java.util.*;

public class MaximumProduct3Nums_628 {
    //Keep in mind that two negative numbers make a positive number
    //so there can be two cases:-
    //1.When all the numbers are positive - take all the numbers from the end after sorting the array
    //2.When there are negative numbers in the array too - take two numbers from the beginning and a number from the end
    static int maximumProduct(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int ans1 = nums[n - 1] *nums[n - 2] *nums[n - 3];
        int ans2 = nums[0] *nums[1] *nums[n - 1];
        return Math.max(ans1, ans2);
    }
    //The internal sorting algorithm of java takes O(NlogN) time complexity
    //so we can optimize the solution if we can do it in O(N) time complexity
    static int maximumProduct2(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for(int i : nums){
            if(max1 < i){
                max3 = max2;
                max2 = max1;
                max1 = i;
            }else if(max2 < i){
                max3 = max2;
                max2 = i;
            }else if(max3 < i){
                max3 = i;
            }

            if(min1 > i){
                min2 = min1;
                min1 = i;
            }else if(min2 > i){
                min2 = i;
            }
        }
        return Math.max(max1*max2*max3, min1*min2*max1);
    }

    public static void main(String[] args) {

        System.out.println(maximumProduct2(new int[]{-1,-2,-3}));
    }
}
