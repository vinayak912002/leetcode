public class ShuffleString_1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }
    static String restoreString(String s, int[] indices){
        char[] arr = new char[s.length()];

        //iterating over the string and adding the values according to the index.
        for(int i = 0; i < arr.length; i++){
            arr[indices[i]] = s.charAt(i);
        }
        return String.valueOf(arr);//String.valueOf() is used to convert any datatype to String
    }
}
