class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int low=1;
        int high=max;
        int ans=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(nums,mid,threshold)){
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;
    }
    public boolean isPossible(int [] nums,int divisor,int threshold){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=Math.ceil((double)nums[i]/divisor);
        }
        if(ans<=threshold)
            return true;
        else
            return false;
    }
}