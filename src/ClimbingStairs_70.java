public class ClimbingStairs_70 {
    public static void main(String[] args) {
        System.out.println(climbStairs2(4));
    }
    public static int climbStairs(int n) {
        //we observe that there is a recursive relation followed here(by mathematical induction)
        // F(x) = F(x - 1) + F(x - 2)
        //This is the recursive solution
        if(n == 1 || n == 2){
            return n;
        }
        return  climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int climbStairs2(int n) {
        //The iterative solution
        if(n <= 2){
            return n;
        }
        int a = 1;
        int b = 2;
        for(int i = 2; i < n; i++){
            int temp = b;
            b += a;
            a = temp;
        }
        return b;
    }
}
