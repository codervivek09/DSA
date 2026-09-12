// Q. 1252 Cells with Odd Values in a Matrix

class Q001252_Cells_with_Odd_Values {
    int ind_row = indices.length;
        int mat [][] = new int [m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = 0;
            }
        }

        for(int i=0; i<ind_row; i++){
            int row = indices[i][0];
            int col = indices[i][1];


            // Go to row[i] increment by 1
            for(int j=0; j<n; j++){
                mat[row][j]++;
            }

            // Go to col[i] increment by 1
            for(int j=0; j<m; j++){
                mat[j][col]++;
            }
        }

        int count = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]%2==1){
                    count++;
                }
            }
        }
        return count;
}