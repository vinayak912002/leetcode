public class Kth_missing_positive_integer1539 {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9};
        System.out.println(findKthPositive(arr,9));
    }
    //for more watch https://www.youtube.com/watch?v=p0P1JNHAB-c (fisher coder)
    //there will be three cases
    //case 1:where the ans is before the array. arr: [3,4,5], k=2, result=2
    //case 2:where the ans is after the array. arr: [1,2,3], k=2, result=5
    //case 3:where the ans is in between the array. arr: [3,4,5,9], k=3, result=6
    static int findKthPositive(int[] arr,int k){
        int missed = 0; //no of missed numbers.
        //now we go through the given array.
        for(int i = 0; i < arr.length; i++){
            //three cases, three branches one of them will be outside the for loop.
            //for case 1
            if(i==0){
                missed += arr[0] - 1;
                if(missed >= k){
                    return k;
                }
            }else{
                //for case 3
                missed += arr[i] - arr[i-1] - 1;
                if(missed >= k){
                    missed -= arr[i] - arr[i-1] - 1;
                    int result = arr[i - 1];
                    while(missed++<k){
                        result++;
                    }
                    return result;
                }
            }
        }
        //for case2
        int result = arr[arr.length - 1];//taking the last element as the result
        while(missed++<k){
            result++;
        }
        return result;
    }
}
