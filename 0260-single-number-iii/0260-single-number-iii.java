class Solution {
    public int[] singleNumber(int[] nums) {
        long xor=0;
        for(int i=0;i<nums.length;i++)
            xor=xor^nums[i];
        int b1=0;
        int b2=0;
        int num=(int)((xor&(xor-1))^xor);
        for(int i=0;i<nums.length;i++){
            if((num&nums[i])!=0)
                b1^=nums[i];
            else
                b2^=nums[i];
        }
        int []ans={b1,b2};
        return ans;
    }
}