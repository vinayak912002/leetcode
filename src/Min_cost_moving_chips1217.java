public class Min_cost_moving_chips1217 {
    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};
        System.out.println(minCostToMoveChips(position));
    }
    //to solve this problem we need to keep in mind two things
    //all the chips at even indices can be moved to the 0th index
    //all the chips at odd indices can be moved to the 1st index
    static int minCostToMoveChips(int[] position){
        int even= 0;
        int odd= 0;
        for(int i = 0;i<position.length;i++){
            if(position[i]%2==0){
                even++;
            }
            if(position[i]%2!=0){
                odd++;
            }
        }
        //now we only need to compare the value of even and odd and the one which is smaller will be our answer.
        return(Math.min(even,odd));
    }
}
