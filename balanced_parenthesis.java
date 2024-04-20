//You are given a string of brackets i.e. '{', '}' , '(' , ')', '[' , ']' . You have to check whether the sequence of parenthesis is balanced or not.
//For example, "(())", "(())()" are balanced and "())(", "(()))" are not.

//Input Format
//A string of '(' , ')' , '{' , '}' and '[' , ']' .

//Constraints
//1<=|S|<=10^5

//Output Format
//Print "Yes" if the brackets are balanced and "No" if not balanced.


import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner kx = new Scanner(System.in);
		String s= kx.next();
		Stack<Character> st= new Stack <>();
		for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);
            else if (st.isEmpty() || !check(st.pop(), ch)) {
                System.out.println("No");
                return; 
            }
        }
        if (st.isEmpty())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    static boolean check(char a, char b) {
        if (a == '(' && b== ')')
            return true;
        else if (a == '{' && b== '}')
            return true;
        else if (a == '[' && b== ']')
		    return true;
		else
		    return false;
	}
}
		
