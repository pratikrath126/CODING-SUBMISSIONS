class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map=new HashMap<>();
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++){
            char mapped=s.charAt(i);
            char replaced=t.charAt(i);
            if(!map.containsKey(mapped)){
                if(!map.containsValue(replaced))
                    map.put(mapped,replaced);
                else
                    return false;
            }
            else{
                char temp=map.get(mapped);
                if(temp!=replaced)
                    return false;
            }
            
        }
        return true;
    }
}