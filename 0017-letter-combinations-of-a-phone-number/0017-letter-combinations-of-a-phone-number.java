class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()==0)
            return new ArrayList<>();
        Map<Character,String> letters=new HashMap<>();
        letters.put('2',"abc");
        letters.put('3',"def");
        letters.put('4',"ghi");
        letters.put('5',"jkl");
        letters.put('6',"mno");
        letters.put('7',"pqrs");
        letters.put('8',"tuv");
        letters.put('9',"wxyz");
        List<String> ans=new ArrayList<>();
        findCombinations(0,digits,letters,ans,"");
        return ans;
    }
    public void findCombinations(int index,String digits,Map<Character,String> letters,List<String> ans,String ds){
        if(index==digits.length()){
            ans.add(ds);
            return;
        }
        
        String s=letters.get(digits.charAt(index));
        for(Character c:s.toCharArray()){
            findCombinations(index+1,digits,letters,ans,ds+c);

        }
        
    }
}