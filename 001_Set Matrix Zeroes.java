class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean x[][] = new boolean[n][m];
        for(int i = 0; i < n; i++){
            Arrays.fill(x[i], false);
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    x[i][j] = true;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(x[i][j]){
                    change(matrix, i, j);
                }
            }
        }
    }
    void change(int[][] matrix, int i, int j){
        for(int a = 0; a < matrix.length; a++){
            matrix[a][j] = 0;
        }

        for(int a = 0; a < matrix[0].length; a++){
            matrix[i][a] = 0;
        }
    }
}
