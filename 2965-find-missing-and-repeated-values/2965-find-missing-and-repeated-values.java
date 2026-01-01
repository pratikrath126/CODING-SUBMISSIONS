class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long n=grid.length*grid.length;
        long sn=(n*(n+1))/2;
        long s2n=(n*(n+1)*(2*n+1))/6;
        long s=0;
        long s2=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                s+=grid[i][j];
                s2+=grid[i][j]*grid[i][j];
            }
        }
        long val1=s-sn;
        long val2=s2-s2n;
        val2=val2/val1;
        long x=(val1+val2)/2;
        long y=x-val1;
        int [] ans={(int)x,(int)y};
        return ans;
    }
}