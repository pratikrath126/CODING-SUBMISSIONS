class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int [] ans=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=i+n;j++){
                int index=(j%n);
                if(nums[index]>nums[i]){
                    ans[i]=nums[index];
                    break;
                }else{
                    ans[i]=-1;
                }
            }
        }
        return ans;
        
    }
}