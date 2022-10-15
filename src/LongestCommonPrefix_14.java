public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
    static String longestCommonPrefix(String[] strs){
        String prefix = strs[0]; //we take the first element in the string as the prefix
        for(int index = 1; index < strs.length; index++){ //now we iterate over the array starting from the second element
            while(strs[index].indexOf(prefix) != 0){ //now we check the index of the prefix in all the elements
                //it will return 0 if it exists or -1 if it does not exist.
                prefix = prefix.substring(0, prefix.length() - 1);//if it does not return 0 we strip one letter from the prefix and check again
            }
        }
        return prefix;
    }
}
