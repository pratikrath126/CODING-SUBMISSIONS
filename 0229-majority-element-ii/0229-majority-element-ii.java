class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> hs=new HashMap<>();
        int t=(nums.length/3)+1;
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
            if(hs.get(nums[i])==t)
                l.add(nums[i]);
            if(l.size()==2)
                break;
        }
        return l;
    }
}