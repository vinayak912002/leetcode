package arrays;

import java.util.Arrays;

public class Reshape_the_matrix566 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2},
                {3,4}
        };
        //deepToString method is used to convert 2D arrays to Strings.
        String answer = Arrays.deepToString(matrixReshape(matrix,4,1));
        System.out.println(answer);
    }
    static int[][] matrixReshape(int[][] mat, int r, int c){

        //getting the number of columns and rows in the matrix
        int rows = mat.length;
        int col  = mat[0].length;

        //checking if the matrix is possible to convert or not.
        if(rows*col!=r*c) {
            return mat;//if the matrix is not possible to convert we return the given matrix itself.
        }

        int[][] ans = new int[r][c];//this is the array that we are going to return.

        int ncol=0, nrow=0;//these are the variables for the new matrix
        //now we traverse over the matrix,and simply add the elements
        for(int i =0;i<rows;i++){
            for(int j = 0;j<col;j++){

                //first we check the col index ,if we do not check this first the index will become out of bounds.
                if(ncol==c){
                    ncol= 0;//when the index of column exceeds the limit we set it back equal to zero.
                    nrow++;//we also increase the number of rows.
                }
                ans[nrow][ncol]=mat[i][j];
                ncol++;
            }
        }
        return ans;
    }
}
