class Solution {
    public int maxProduct(int[] nums) {
        
        int pp=1;
        int sx=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){

            if(pp==0) pp=1;
            if(sx==0) sx=1;
            pp*=nums[i];
            sx*=nums[nums.length-1-i];
            max=Math.max(max,Math.max(pp,sx));
        }
        return max;
    }
}