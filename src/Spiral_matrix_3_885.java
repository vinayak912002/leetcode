import java.util.*;

public class Spiral_matrix_3_885 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(spiralMatrix3(1,4,0,0)));
    }
    static int[][] spiralMatrix3(int rows,int cols,int rStart,int cStart){
        //first we will create the matrix that we are going to return.
        //since each row will contain the (X,Y) coordinates the column length will be 2.
        int[][] matrix = new int[rows*cols][2];
        //now we are creating a variable i which will keep the count of the index in which the coordinates will be filled into the final result.
        int i =0;
        matrix[i++] = new int[]{rStart,cStart};//we fill up the i th position with the coordinates which we are currently on.
        int len = 0;//number of steps we are going to move.
        int d = 0;//the direction in which we are moving.
        int[] directions = {0,1,0,-1,0};//we will use this list to move toward the desired direction.
        while(i<rows*cols){
            if(d==0 || d==2) {
                len++;//we need to increase the steps everytime we face east or west.
            }
                for(int j = 0;j<len;j++){
                    rStart += directions[d];//changing the y coordinate
                    cStart += directions[d+1];//changing the x coordinate
                    //we will add the coordinates only when we are inside the grid/
                    //for that we check if we are inside the grid or not
                    if(rStart<rows && rStart>=0 && cStart < cols && cStart >= 0){
                        matrix[i++] = new int[]{rStart,cStart};//here we are basically creating a new object and assigning its value to the final answer.
                    }
                }

            d = ++d % 4;//because we want d to stay between 0 and 4
        }
        return matrix;
    }
}
