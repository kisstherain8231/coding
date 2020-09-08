package offer.coding_31;

import java.util.Stack;

public class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        boolean res = true;

        Stack<Integer> stack = new Stack<>();
        Integer index = 0;
        //stack.push(pushed[0]);
        for (int i = 0; i < pushed.length;) {
           stack.push(pushed[i]);
           i++;
           while (!stack.isEmpty() && (stack.peek() == popped[index])) {
               stack.pop();
               index++;
           }
        }

       // array visit was completed
        if (stack.isEmpty()){
            return true;
        } else {
            for (int pos = index; pos < popped.length; pos++) {
                int element = stack.pop();
                if (element != (popped[pos])) {
                    return false;
                }
            }
        }

        return res;
    }
}
