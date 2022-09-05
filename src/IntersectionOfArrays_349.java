import java.util.*;

public class IntersectionOfArrays_349 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1,3};
        int[] nums2 = {2,2,3};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    //brute force approach
    //make a new hash set
    //if any element is in both the lists then add it in the hashset
    //add all the elements in an array and then return that array
    static int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    h.add(nums2[j]);
                }
            }
        }
        int[] ans = new int[h.size()];
        int index = 0;
        for(Integer i : h){
            ans[index] = i;
            index++;
        }
        return ans;
    }

    //optimized solution
    //using binary search
    static int[] intersection2(int[] nums1, int[] nums2){
        Arrays.sort(nums2);
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            //the internal loop has been optimized from linear to log(n)
            if(BinarySearch(nums2, nums1[i])){
                h.add(nums1[i]);
            }
        }
        int[] ans = new int[h.size()];
        int index = 0;
        for(Integer i : h){
            ans[index] = i;
            index++;
        }
        return ans;
    }
    static boolean BinarySearch(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int m = s + (e - s)/2;
            if(arr[m] == target){
                return true;
            }
            if(arr[m] < target){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return false;
    }
}
