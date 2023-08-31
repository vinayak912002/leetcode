import java.util.*;

public class ThreeSum_15 {
    //In this question we have to return all the triplets whose sum is 0
    //the indices of the triplets should be distinct

    //This function is using the sort method
    static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        //since all the triplets need to be unique, so we are creating a Set of Lists
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++){
            int p1 = i + 1; //first pointer
            int p2 = nums.length - 1; //second pointer

            while (p1 < p2){
                int sum = nums[i] + nums[p1] + nums[p2];
                if (sum == 0){
                    ArrayList<Integer> toadd = new ArrayList<>();
                    toadd.add(nums[i]);
                    toadd.add(nums[p1]);
                    toadd.add(nums[p2]);

                    result.add(toadd);
                    p1++;
                }else if (sum < 0){
                    p1++;
                }else {
                    p2--;
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
