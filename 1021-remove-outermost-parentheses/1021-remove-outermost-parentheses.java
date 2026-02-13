class Solution {
    public String removeOuterParentheses(String s) {
     Deque<Character> stack =new ArrayDeque<>();
     char[] ch=s.toCharArray();
     String ans="";
     for(int i=0;i<s.length();i++){
        if(ch[i]==')')
            stack.pop();
        if(!stack.isEmpty())
            ans+=ch[i];
        if(ch[i]=='(')
            stack.push('(');
     }   
     return ans;
    }
}