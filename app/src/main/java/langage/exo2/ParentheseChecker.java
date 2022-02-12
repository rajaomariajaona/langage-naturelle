package langage.exo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParentheseChecker {
    private final static Map<Character, Character> parenthesis = Stream.of(new Character[][] {
            { '(' , ')' },
            { '{' , '}' },
            { '<' , '>' },
            { '[' , ']' },
    }).collect(Collectors.toMap(v -> v[0], v -> v[1]));
    public static boolean check(String toCheck){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < toCheck.length(); i++) {
            if(ParentheseChecker.parenthesis.containsKey(toCheck.charAt(i))) {
                stack.push(toCheck.charAt(i));
            }else if(ParentheseChecker.parenthesis.containsValue(toCheck.charAt(i))){
                if(!stack.isEmpty()){
                    Character top = stack.pop();
                    if(!ParentheseChecker.parenthesis.get(top).equals(toCheck.charAt(i))){
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
