class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low=0;
        int high=mat[0].length-1;

        while(low<=high){
            int mid=(low+high)/2;
            int max=findMax(mat,mid);
            int left=mid==0?-1:mat[max][mid-1];
            int right=mid==mat[0].length-1?-1:mat[max][mid+1];
            if(left<mat[max][mid] && right<mat[max][mid]){
                return new int[]{max,mid};
            }
            else if(left>mat[max][mid])
                high=mid-1;
            else
                low=mid+1;
        }
        return new int[]{-1,-1};
    }
    public int findMax(int [][] mat,int col){
        int max=-1;
        int index=-1;
        for(int i=0;i<mat.length;i++){
            if(mat[i][col]>max){
                max=mat[i][col];
                index=i;
            }
        }
        return index;
    }
}