import java.util.HashMap;
//In this code we are taking each character from String s and mapping it to the characters of String t
//and then we convert the string s to t using that mapping and if the result obtained is equal to t then we return true.
public class IsomorphicStrings_205 {
    static String transform(String s, String t){
        HashMap<Character, Character> map = new HashMap<>();
        StringBuilder res = new StringBuilder();
        int i = 0;
        int j = 0;
        while(i < s.length() && j < t.length()){
            if(map.containsKey(s.charAt(i))){
                res.append(map.get(s.charAt(i)));
                i++;
                j++;
            }else{
                if(!map.containsValue(t.charAt(j))) {
                    map.put(s.charAt(i), t.charAt(j));
                }
                res.append(map.get(s.charAt(i)));
                i++;
                j++;
            }
        }
        return res.toString();
    }
    static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()) return false;
        if(t.equals(transform(s, t)))return true;
        return false;
    }
}
