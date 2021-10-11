import java.util.*;

public class Balanced {

    public static void main(String[] args) {

        //TESTS
        System.out.println(isBalanced("()")); //- true
        System.out.println(isBalanced("((()))")); //- true
        System.out.println(isBalanced("([[{{}}]])")); //- true
        System.out.println(isBalanced("()(){}{{}}[][[]]")); //- true
        System.out.println(isBalanced("[{()}]")); // - true
        System.out.println(isBalanced("({}{}([{}]))"));// - true
        System.out.println(isBalanced("[({(})]")); // false
        System.out.println(isBalanced("{[}"));//- false
        System.out.println(isBalanced("({")); //- false

    }

    public static boolean isBalanced(String str) {


        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {

            char x = str.charAt(i);

            if (x == '(' || x != '{' || x != '[') {
                stack.push(x);
            } else if (x == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                } else if (x == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    } else if (x == '}') {
                        if (stack.isEmpty() || stack.pop() != '{') {
                            return false;
                        }
                    }
                }
            }
            //return stack.isEmpty();
        }
        return stack.isEmpty();
    }//return stack.isEmpty();
}


