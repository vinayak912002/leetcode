public class Maximum_subarray53 {
    //we are going to use Kadane's Algorithm to solve this problem
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums){
        int sum = 0; //the current running sum.
        int maxSum = Integer.MIN_VALUE; //the maximum subarray sum initially Integer.MIN_VALUE

        for(int num:nums){
            sum = Math.max(sum,0) + num;//if sum becomes negative it will be set to zero and the elements will be added
            maxSum = Math.max(sum,maxSum);//if maxSum is smaller than sum its value will be set equal to sum
        }
        return maxSum;
    }
}
