class Solution {
    public String reverseWords(String s) {
        String ans="";
        s.trim();
        s=reverse(s);
        for(int i=0;i<s.length();i++){
            
            String word="";
            while(i<s.length() && s.charAt(i)!=' '){
                word+=s.charAt(i++);
            }
            if(word.length()>0){
            word=reverse(word);
            if(ans.length()>0)
                ans+=" "+word;
            else
                ans+=word;
            }
        }
        return ans;
    }
    public String reverse(String s){
        StringBuilder st=new StringBuilder(s);
        st.reverse();
        return st.toString();
    }
}