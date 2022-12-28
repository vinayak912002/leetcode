import java.util.*;

public class WordPattern_290 {
    public static void main(String[] args) {
        System.out.println(wordPattern("aa","dog cat"));
    }
    static boolean wordPattern(String pattern, String str) {
        //go through the words and patterns in parallel while checking the indexes where they last appeared.
        String[] words = str.split(" ");//the split method splits the string taking the given character as splitting point
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i=0; i<words.length; i++)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))//the put method return the previous value associated with the given key if present else it returns -1
                return false;
        return true;
    }
}