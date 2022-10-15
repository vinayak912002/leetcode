public class RomanToInteger_13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
    }
    static int romanToInt(String s){
        //observe that while reading from right to left if the current character is smaller than the previous one we subtract it from the whole else we add it.

        int currentNumber = 0, previousNumber = 0, answer = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            switch (s.charAt(i)){
                case 'I':
                    currentNumber = 1;
                    break;
                case 'V':
                    currentNumber = 5;
                    break;
                case 'X':
                    currentNumber = 10;
                    break;
                case 'L':
                    currentNumber = 50;
                    break;
                case 'C':
                    currentNumber = 100;
                    break;
                case 'D':
                    currentNumber = 500;
                    break;
                case 'M':
                    currentNumber = 1000;
                    break;
            }
            if(currentNumber < previousNumber){
                answer -= currentNumber;
            }else {
                answer += currentNumber;
            }
            previousNumber = currentNumber;
        }
        return answer;
    }
}
