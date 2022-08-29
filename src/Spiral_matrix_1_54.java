import java.util.*;

public class Spiral_matrix_1_54 {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(spiralOrder(mat));
    }
    static List<Integer> spiralOrder(int[][] matrix) {
       //we will use two pointers each for rows and columns both.

        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int startCol = 0;
        int startRow = 0;
        int endCol = n-1;
        int endRow = m-1;

        while(startRow<=endRow && startCol<=endCol){

            for(int j = startCol;j<=endCol;j++){
                list.add(matrix[startRow][j]);
            }
            for(int j = startRow+1;j<=endRow;j++){
                list.add(matrix[j][endCol]);
            }
            for(int j = endCol-1;j>=startCol;j--){

                //we are imposing this condition because when we reach it we would have already reached to the end of the spiral.
                if(startRow==endRow){
                    break;
                }
                list.add(matrix[endRow][j]);
            }

            for(int j = endRow-1;j>=startRow+1;j--){

                //here also we are imposing because we would have reached the end of the spiral.
                if(startCol==endCol){
                     break;
                 }
                list.add(matrix[j][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return list;
    }
}
