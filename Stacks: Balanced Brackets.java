/*
Given  strings of brackets, determine whether each sequence of brackets is balanced. 
If a string is balanced, print YES on a new line; otherwise, print NO on a new line.
*/

public class Solution {
    
    public static boolean isBalanced(String expression) {
        if(expression.length() % 2 != 0)
            return false;
        Stack stack = new Stack();
        char[] characters = expression.toCharArray();
        for(char c: characters){
            switch(c){
                case '{' : stack.push('}');
                            break;
                case '(' : stack.push(')');
                            break;
                case '[' : stack.push(']');
                            break;
                default: if( stack.isEmpty() || c!= stack.pop()){
                    return false;
                }
            }
           
        }
        return stack.isEmpty();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
