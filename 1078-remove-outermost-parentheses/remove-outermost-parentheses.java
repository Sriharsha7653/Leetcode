class Solution {
    public String removeOuterParentheses(String s) {
        int cnt =0;
        StringBuilder res= new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==')'){cnt--;}
            if(cnt!=0){res.append(c);}
            if(c=='('){cnt++;}
        }
        return res.toString();
    }
}