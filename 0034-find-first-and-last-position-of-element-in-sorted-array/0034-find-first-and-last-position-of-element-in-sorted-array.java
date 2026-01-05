class Solution {
    public int lowerBound(int [] nums,int target){
            int ans=nums.length;
            int low=0;
            int high=nums.length-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(nums[mid]>=target){
                    ans=mid;
                    high=mid-1;
                }
                else
                    low=mid+1;
            }
            return ans;
        }
        public int upperBound(int [] nums,int target){
            int ans=nums.length;
            int low=0;
            int high=nums.length-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(nums[mid]>target){
                    ans=mid;
                    high=mid-1;
                }
                else
                    low=mid+1;
            }
            return ans;
        }
    public int[] searchRange(int[] nums, int target) {
        
        int lb=lowerBound(nums,target);
            if(lb==nums.length || nums[lb]!=target)
                return new int[]{-1,-1};
        int up=upperBound(nums,target);
        return new int []{lb,up-1};
    }
}