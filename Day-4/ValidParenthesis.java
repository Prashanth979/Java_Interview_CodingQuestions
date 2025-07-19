import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s="[{()[]}()]";
        boolean isValid = validParenthesisCheck(s);
        if(isValid)
            System.out.println("Given string is having valid parentheses");
        else    
        System.out.println("Given string is not having valid parentheses");
    }
    public static boolean validParenthesisCheck(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{') 
                stack.push(ch);
            else{
                // If it's a closing bracket, check if the stack is non-empty
                // and if the top of the stack is a matching opening bracket
                if(!stack.empty()){
                    if((stack.peek()=='(' && ch==')') || 
                    (stack.peek()=='[' && ch==']')    ||
                    (stack.peek()=='{' && ch=='}'))
                    stack.pop();
                }else{
                    // Unmatched closing bracket
                    return false;
                }
            }
        }
    // If stack is empty, return true (balanced), 
    // otherwise false
    return stack.empty();
    }
}
