public class MoveZeroes_283 {
    static void moveZeroes(int[] nums){
        //Here i is the fast pointer and j is the slow pointer
        int j = 0, count = 0, ln = nums.length - 1;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                if(count == 0){
                    j++;
                }else {
                    nums[j++] = nums[i];
                }
            }else {
                count++;
            }
        }
        while(count>0){
            nums[ln] = 0;
            ln--;
            count--;
        }
    }
}
