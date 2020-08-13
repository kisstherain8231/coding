package offer.coding_09;

import java.util.Stack;

class CQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public CQueue() {

    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack1.size() == 0) {
            return  -1;
        }

        if (stack1.size() == 1) {
            return stack1.pop();
        }

        for (Integer e : stack1) {
            stack2.push(e);
        }

        Integer result = stack2.peek();

        //恢复
        for (Integer e : stack2) {
            stack1.push(e);
        }

        return result;
    }
}

