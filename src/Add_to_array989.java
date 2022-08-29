import java.util.*;

public class Add_to_array989 {
    public static void main(String[] args) {

    }
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        int i = num.length-1;
        int n = num[i]+k;
        //we take both conditions because if i<0 and k>0 then we need to add to it. for ex 999+15
        while(i>=0 || k>0){
            if(i>=0){
                ans.add((num[i]+k)%10);
                k=(num[i]+k)/10;
                i--;
            }else{
                ans.add(k%10);
                k=k/10;
                i--;
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
