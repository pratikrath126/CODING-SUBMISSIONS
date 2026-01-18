class Solution {
    public int mySqrt(int x) {
        int low=0;
        int high=x;
        int ans=1;
        
        while(low<=high){
            int mid=(low+high)/2;
            long val=(long)mid*mid;
            if(val<=x){
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return ans;//or high as it is first possible ans low is first not possible ans
    }
}