public class SpecialArray_1608 {
    public static void main(String[] args) {

    }
    //we are going to use binary search to find the answer
    //since we are dealing with positive integers, so we start our search from 1
    //for finding out why the limit is nums.length take the case where the answer is found outside the array i.e. before it
    static int specialArray(int[] nums){

        int s = 1, e = nums.length;
        while(s <= e){
            int m = s + (e - s)/2;
            int greater = count(nums,m);

            if(greater == m){
                return m;
            }
            if(greater < m){
                e = m - 1;
            }
            else{
                s = m + 1;
            }
        }
        return -1;
    }
    static int count(int[] arr, int target){
        int count = 0;
        for(int i : arr){
            if(i >= target){
                count++;
            }
        }
        return count;
    }
}
