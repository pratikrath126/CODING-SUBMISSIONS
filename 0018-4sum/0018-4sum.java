class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> ans =new HashSet<>();

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                Set<Long> hs=new HashSet<>();
                for(int k=j+1;k<nums.length;k++){
                    long sum=nums[i]+nums[j];
                    sum+=nums[k];
                    
                    if(hs.contains(target-sum)){
                        List<Integer> l=Arrays.asList(nums[i],nums[j],nums[k],(int)(target-sum));
                        Collections.sort(l);
                        ans.add(l);
                    }
                    hs.add((long)nums[k]);
                }
            }
        }
        return new ArrayList<>(ans);
    }
}