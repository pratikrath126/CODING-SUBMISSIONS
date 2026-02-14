class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String ans="";
        String s=strs[0];
        String a=strs[strs.length-1];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=a.charAt(i))
                return ans;
            ans+=s.charAt(i);
        }
        return ans;
    }
}