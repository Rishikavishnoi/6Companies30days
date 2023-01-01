class Solution {
    public int evalRPN(String[] num) {
        Stack<Integer> stk=new Stack<>();

      for(int i=0;i<num.length;i++){
          if(num[i].equals("+")){
            int b=stk.pop();
            int a=stk.pop();
            stk.push(a+b);
          }
           else if(num[i].equals("-")){
            int b=stk.pop();
            int a=stk.pop();
            stk.push(a-b);
          }
           else if(num[i].equals("*")){
            int b=stk.pop();
            int a=stk.pop();
            stk.push(a*b);
          }
          else if(num[i].equals("/")){
            int b=stk.pop();
            int a=stk.pop();
            stk.push(a/b);
          }
          else{
              stk.push(Integer.parseInt(num[i]));
          }
      }
   return stk.pop();
        
    }
}