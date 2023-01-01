[leetCode](https://leetcode.com/problems/evaluate-reverse-polish-notation/)

##Evaluate Reverse Polish Notation

Solve using Stack - 
- Parse the string 
- if you get operand such as x , y , a, b push it unto the stack
- else if you get operator such as + , - , * ,/ 
then pop two operand and perform operation and then again push result on the stack
