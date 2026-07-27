import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // If it is an opening bracket, push it
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If it is a closing bracket, check the match
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets were matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([])";
        String s5 = "([)]";

        System.out.println(obj.isValid(s1)); // true
        System.out.println(obj.isValid(s2)); // true
        System.out.println(obj.isValid(s3)); // false
        System.out.println(obj.isValid(s4)); // true
        System.out.println(obj.isValid(s5)); // false
    }
}
