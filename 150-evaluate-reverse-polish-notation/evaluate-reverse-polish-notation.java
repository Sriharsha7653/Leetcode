class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st= new Stack<>();
        for( String s:tokens){
         
            if(isOperator(s)){
            int num2=Integer.parseInt(st.pop());
            int num1=Integer.parseInt(st.pop());
            int res=0;
            if(s.equals("+")){
                res=num1+num2;
            }
            else if(s.equals("-")){
                res=num1-num2;
            }
            else if(s.equals("*")){
                res=num1*num2;
            }
            else{
                res=num1/num2;
            }
            st.push(Integer.toString(res));
            }
            else{
                st.push(s);
            }
        }
        return Integer.parseInt(st.peek());
    }
    public static boolean isOperator(String s){
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                return true;
            }
            return false;
        }
}