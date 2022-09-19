import java.util.*;


public class FairCandySwap_888 {
    public static void main(String[] args) {

    }
    //so here we are going to use simple math
    //let the number of candies that Alice and Bob have, be s1 and s2 respectively
    //Alice gives x candies to Bob and gets y candies back from him
    //find the value of y
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes){
        int s1 = 0, s2 = 0;
        for(int x : aliceSizes) s1 += x;
        for(int y : bobSizes) s2 += y;

        int delta = (s2 - s1)/2;//if alice gives x chocolates she wants x + delta chocolates back

        Set<Integer> setB = new HashSet<>();
        for(int x : bobSizes) setB.add(x);//we are adding the different amount of chocolate that bob has in a set

        //if Alice is giving x chocolates bob must have y = x + delta chocolates to give back to her
        for(int x : aliceSizes){
            if(setB.contains(x + delta)) {
                return (new int[]{x, x + delta});
            }
        }
        throw null;//if answer not found raise a custom error null
    }
}
