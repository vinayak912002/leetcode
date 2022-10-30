public class AddBinary_67 {
    public static void main(String[] args) {
        String a = "11";
        String b = "10";
        System.out.println(addBinary(a, b));
    }
    static String addBinary(String a, String b){
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        //we are using i and j as pointers for the Strings a and b respectively
        int i = a.length() - 1;
        int j = b.length() - 1;

        while(i >= 0 || j >= 0){
            int sum = carry;
            //we subtract the char by '0' to convert it into integer.
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';

            //variable = boolean expression ? value 1 : value 2
            carry = sum > 1 ? 1 : 0; //if the boolean expression is true then the variable will be assigned the fist value else it will be assigned the second value.

            ans.append(sum % 2);
        }
        if(carry != 0) ans.append(carry);
        return ans.reverse().toString();
    }
}
