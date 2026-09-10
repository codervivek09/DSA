// Q.1572 Matrix Fiagonal Sum

class Q001572_Matrix_Diagonal_Sum {
    public int diagonalSum(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

    // Primary Diagonal
        int sum = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i==j){
                    sum += mat[i][j];
                }
            }
        }

    // Secondary Diagonal
        int sum2 = 0;
        int i =0, j = col -1;

        while (i<row && col >= 0) { 
            sum2 += mat[i][j];
            i++;
            j--;
        }

        int SUM = sum + sum2;
        if(row %2 !=0){
            SUM = SUM - mat[row/2][col/2];
        }
        return SUM;
    }
}