class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        findCombinations(1,k,n,0,ans,new ArrayList<>());
        return ans;
    }
    public void findCombinations(int num,int k,int n,int sum,List<List<Integer>> ans,List<Integer> ds){
        if(sum==n && ds.size()==k){
                ans.add(new ArrayList<>(ds));
                return;
        }
        if(ds.size()>=k || sum>n || num>9)
            return;
        ds.add(num);
        sum+=num;
        findCombinations(num+1,k,n,sum,ans,ds);
        ds.remove(ds.size()-1);
        sum-=num;
        findCombinations(num+1,k,n,sum,ans,ds);
    }
}