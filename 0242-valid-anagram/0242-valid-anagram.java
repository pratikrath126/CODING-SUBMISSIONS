class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<t.length();i++){
            hs.put(t.charAt(i),hs.getOrDefault(t.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(hs.getOrDefault(s.charAt(i),0)>0){
                hs.put(s.charAt(i),hs.get(s.charAt(i))-1);
            }
            else
                return false;
        }
        return true;
    }
}