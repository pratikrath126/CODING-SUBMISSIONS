class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;   
        int min=-10; 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    for(int x=0;x<m;x++){
                        if(matrix[x][j]!=0)
                        matrix[x][j]=min;
                    }
                    for(int y=0;y<n;y++){
                        if(matrix[i][y]!=0)
                        matrix[i][y]=min;
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==min)
                    matrix[i][j]=0;
            }
        }
    }
}