package com.jbs;

import java.util.Stack;

/*	Stack
 * -- Constructors: Stack()
 * -- Methods:
 * 	A. push(Object obj)
 * 	B. pop()
 * 	C. peek()
 * 	D. empty()
 * 	E. search("B") -> Return offset of the element. Top element = 1, next to top element = 2 and so on.
 */

/* Example highlight
 * -----------------
This code checks if the parentheses in the given expression are balanced or not. It uses a Stack to keep track of the opening 
parentheses. When it encounters a closing parenthesis, it checks the top of the stack to see if it matches. If it does, it pops 
the opening parenthesis from the stack. If it doesn’t, or if the stack is empty, it returns false. After checking all the 
parentheses, it returns true if the stack is empty (which means all the parentheses were balanced) and false otherwise.
 */
public class TestStack {
	public static boolean areParenthesesBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
			}
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        String expr = "([{[}])";

        if (areParenthesesBalanced(expr)) {
            System.out.println("Balanced ");
		} else {
            System.out.println("Not Balanced ");
		}
    }
}
