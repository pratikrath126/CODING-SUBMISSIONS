class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;   
        boolean [] m1=new boolean[m];
        boolean [] n1=new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    m1[i]=true;
                    n1[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(m1[i] || n1[j])
                    matrix[i][j]=0;
            }
        }
    }
}