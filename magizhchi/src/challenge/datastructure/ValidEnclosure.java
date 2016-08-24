package challenge.datastructure;

import java.util.Stack;

/**
 * Created by Raj on 8/23/16.
 *
 * Check if a string has a valid enclosure
 *
 */
public class ValidEnclosure {

    public static void main(String args[]){

        String input = "{(test}";
        Stack<Character> stack = new Stack<Character>();
        System.out.println("isValid-->"+isValidEnclosure(input, stack));

    }

    private static boolean isValidEnclosure(String input, Stack<Character> stack) {
        for(int i=0; i<input.length(); i++){

            char currentChar = input.charAt(i);

            if(isValidStartingChar(currentChar)){
                stack.push(currentChar);
            }

            if(isValidEndChar(currentChar)){

                if(stack.isEmpty()){
                    return false;
                }

                char prevChar = stack.peek();
                if(areValidStartAndEndChar(prevChar, currentChar)){
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean areValidStartAndEndChar(char start, char end){
        if(start == '{' && end == '}'){
            return true;
        }
        if(start == '['  && end == ']'){
            return true;
        }
        return false;
    }

    private static boolean isValidEndChar(char currentChar) {

        return currentChar == '}' || currentChar == ')';

    }

    private static boolean isValidStartingChar(char currentChar) {

        return currentChar == '{' || currentChar == '(';

    }
}
