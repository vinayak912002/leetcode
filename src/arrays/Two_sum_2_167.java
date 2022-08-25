package arrays;

public class Two_sum_2_167 {
    public static void main(String[] args) {

    }
    static int[] twoSum(int[] numbers, int target) {
        //the key to optimize the solution is that we have to combine the binary search and two pointer approach.
        int beg=0;
        int end=numbers.length-1;
        while(beg<end){
            int a=numbers[beg];
            int b=numbers[end];
            int mid=beg+(end-beg)/2;

            if(a+b == target)
                return new int[]{beg+1,end+1};
            else if(a+b <target){
                if(numbers[mid]+b <target)
                    beg=mid+1;
                else
                    beg++;
            }
            else{
                if(numbers[mid] +a >target)
                    end=mid-1;
                else
                    end--;
            }
        }
        return new int[]{beg+1,end+1};
    }
}
