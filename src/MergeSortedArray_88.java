public class MergeSortedArray_88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(nums2);
    }
    //here we are using bubble sort
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for(int i = m; i < m + n; i++){
            nums1[i] = nums2[k];
            k++;
        }
        for(int i = 0; i < nums2.length; i++){
            for(int j = 0; j < nums2.length - 1; j++){
                if(nums2[j] > nums2[j + 1]){
                    swap(nums2, j, j + 1);
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    //we can make a optimized solution
    static void merge2(int[] nums1, int m, int[] nums2, int n){
        int[] ans = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n){

            if(nums1[i] < nums2[j]) {
                ans[k] = nums1[i];
                i++;
                k++;
            }else{
                ans[k] = nums2[j];
                j++;
                k++;
            }

        }
        //If any of the arrays are not fully traversed then we need to add them in our ans
        while(i < m){
            ans[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n){
            ans[k] = nums2[j];
            j++;
            k++;
        }
        //since we have to make changes in the nums1 array
        for(int l = 0; l < ans.length; l++){
            nums1[l] = ans[l];
        }
    }
}
