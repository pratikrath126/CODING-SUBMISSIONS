class Solution {
    public String removeOuterParentheses(String s) {
     Deque<Character> stack =new ArrayDeque<>();
    
     String ans="";
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)==')')
            stack.pop();
        if(!stack.isEmpty())
            ans+=s.charAt(i);
        if(s.charAt(i)=='(')
            stack.push('(');
     }   
     return ans;
    }
}