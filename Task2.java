/*📔 Написать программу, определяющую правильность расстановки скобок в выражении.

Пример 1: a+(d*3) - истина

Пример 2: [a+(1*3) - ложь

Пример 3: [6+(3*3)] - истина

Пример 4: {a}[+]{(d*3)} - истина

Пример 5: <{a}+{(d*3)}> - истина

Пример 6: {a+]}{(d*3)} - ложь */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Task2
 */
public class Task2 {

  public static void main(String[] args) {
    
  }

  static boolean task2(String str){
    Stack<Character> stack = new Stack<>();
    char[] c = str.toCharArray();
    Map<Character,Character> map = new HashMap<>();
    map.put('(',')');
    map.put('{','}');
    map.put('<','>');
    map.put('[',']');
    for (int i = 0; i < c.length; i++) {
        if(map.containsKey(c[i])) stack.push(c[i]);
        if (map.containsValue(c[i])){
            if (stack.isEmpty() || map.get(stack.pop()) != c[i]) return false;
        }
    }
    if (!stack.isEmpty()) return false;
    return true;
  }
}