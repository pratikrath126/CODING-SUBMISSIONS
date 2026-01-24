class Solution {
    public int splitArray(int[] nums, int k) {
        int low=-1;
        int high=0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            int noOfParts=findParts(nums,mid);
            if(noOfParts<=k)
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }
    public int findParts(int [] nums,int max){
        int sum=0;
        int parts=1;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]>max){
                parts++;
                sum=nums[i];
            }
            else
                sum+=nums[i];
        }
        return parts;
    }
}