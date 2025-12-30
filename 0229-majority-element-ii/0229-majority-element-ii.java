class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(l.isEmpty( ) || l.get(0)!=nums[i]){
                count=0;
                for(int j=0;j<nums.length;j++){
                    if(nums[i]==nums[j])
                        count++;
                }
                if(count>=((nums.length/3)+1))
                l.add(nums[i]);
            }
            if(l.size()==2)
                break;
        }
        return l;
    }
}