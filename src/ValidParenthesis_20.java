import java.util.*;

public class ValidParenthesis_20 {
    public static void main(String[] args) {
        String s = "({{]}})";
        System.out.println(isValid(s));
    }
    static boolean isValid(String s) {
        //creating new hashmap
        HashMap<Character, Character> map = new HashMap<>();
        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');
        //creating the stack
        Stack<Character> stack = new Stack<>();
        //iterate over the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                continue;
            }
            //If the character is opening parenthesis we have to check for the same type of closing parenthesis.
            //If not we need to return false.
            if (stack.size() == 0 || map.get(s.charAt(i)) != stack.pop()) {
                return false;
            }
        }
        //if at the end the stack is empty we return true.
        if(stack.size()==0){
            return true;
        }
        return false;
    }
    //Think about how we can eliminate the hashmap too and use only stack to implement the solution
}

