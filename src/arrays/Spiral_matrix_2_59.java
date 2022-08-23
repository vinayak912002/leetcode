package arrays;

import java.util.Arrays;

public class Spiral_matrix_2_59 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }
    static int[][] generateMatrix(int n){

        int[][] ans = new int[n][n];
        int count = 1;

        int startRow = 0;
        int startCol = 0;
        int endRow = n-1;
        int endCol =n-1;
        while(startRow<=endRow && startCol<=endCol){

            for(int j =startCol;j<=endCol;j++){
                ans[startRow][j]= count;
                count++;
            }

            for(int j =startRow+1;j<=endRow;j++){
                ans[j][endCol] = count;
                count++;
            }

            for(int j = endCol-1;j>=startCol;j--){

                if(startRow==endRow){
                    break;
                }
                ans[endRow][j]=count;
                count++;
            }

            for(int j=endRow-1;j>=startRow+1;j--){

                if(startCol==endCol){
                    break;
                }
                ans[j][startCol]=count;
                count++;
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return ans;
    }
}
