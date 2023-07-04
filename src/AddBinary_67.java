public class AddBinary_67 {
    public static void main(String[] args) {
        String a = "111";
        String b = "11";
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
            //we subtract the char by '0' so that the char value that gets converted to integer remains the same.
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';

            //variable = boolean expression ? value 1 : value 2
            carry = sum > 1 ? 1 : 0; //if the boolean expression is true then the variable will be assigned the fist value else it will be assigned the second value.

            ans.append(sum % 2); //this line appends 0 to ans if sum is 2 and appends 1 to ans if sum is 3
        }
        if(carry != 0) ans.append(carry);
        return ans.reverse().toString();
    }
}
