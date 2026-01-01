class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            Set<Integer> hs=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int k=-(nums[i]+nums[j]);
                if(hs.contains(k)){
                    List<Integer> l=Arrays.asList(nums[i],nums[j],k);
                    Collections.sort(l);
                    ans.add(l);
                }
                hs.add(nums[j]);
            }
        }
        return new ArrayList<>(ans);
    }
}