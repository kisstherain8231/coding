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


        while (!stack1.isEmpty()) {
           Integer tmp = stack1.pop();
            stack2.push(tmp);

        }

        Integer result = stack2.pop();

        while (!stack2.isEmpty()) {
            Integer e = stack2.pop();
            stack1.push(e);
        }

        return result;
    }
}

