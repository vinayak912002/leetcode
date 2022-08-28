package searching;

public class Peak_index_mountain_array852 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println(peakIndexMountainArray(arr));
    }
    //here we are returning the index of the peak element.
    static int peakIndexMountainArray(int[] arr){
        //we are going to use the binary search approach because it is a mountain array
        int s = 0;
        int e = arr.length;
        while(s < e){
            int m = s + (e - s)/2;
            if(arr[m] > arr[m + 1])
                e = m;//because if m is at the 0th index then e will get out of bounds if we do e = m-1.
            else
                s = m + 1;
        }
        return s;
    }
}
