class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
        String sub=s;
        for(int i=0;i<s.length();i++){
            sub=s.substring(i,s.length());
            String s2=s.substring(0,i);
            if(goal.equals(sub+s2))
                return true;
            
        }
        return false;
    }
}