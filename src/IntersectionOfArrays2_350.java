import java.util.*;

public class IntersectionOfArrays2_350 {
    public static void main(String[] args) {
        
    }
    //in this we have to return the intersection of nums1 and nums2
    //each element must appear as many times they appear in both the arrays

    //approach 1  complexity O(N*N)
    static int[] intersect1(int[] nums1, int[] nums2){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    list.add(nums1[i]);
                    nums1[i] = Integer.MAX_VALUE;//the problem was that after every loop the answers will get repeatedly added that's why we change its value so that it doesn't get repeated
                    nums2[j] = Integer.MIN_VALUE;//we have to change both of the values so that they do not get repeated.
                    break;
                }
            }
        }
        int[] ans = new int[list.size()];
        int index = 0;
        for(Integer k : list){
            ans[index] = k;
            index++;
        }
        return ans;
    }

    //approach2 complexity O(N)
    static int[] intersect2(int[] nums1, int[] nums2){
        //since in the question the constraints are that the arrays will contain only thousand elements
        int[] arr = new int[1001];
        int[] ans = new int[1001];
        int count = 0;

        //we add 1 to the index at which there are elements
        for(int i : nums1){
            arr[i]++;
        }

        for(int i : nums2){
            if(arr[i] > 0){
                ans[count++] = i;
                arr[i]--;//it will add elements until arr[i] becomes 0
            }
        }
        return Arrays.copyOfRange(ans, 0 , count);
    }
}
