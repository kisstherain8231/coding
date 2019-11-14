package coding_155;

import java.util.Stack;

public  class MinStack {

    private Stack<Integer> stack = new Stack<>();

    private Stack<Integer> minStack = new Stack<>();
    /**
     * initialize your data structure here.
     */
    public MinStack() {

    }

    public void push(int x) {
        if (stack.isEmpty()) {
            minStack.push(x);
        } else {

            int minElement = minStack.peek();

            if (x < minElement) {
                minStack.push(x);
            } else {
                minStack.push(minElement);
            }
        }

        stack.push(x);
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
        // 去掉最后一个元素
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return  minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj = new MinStack();
 * obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4 = obj.getMin();
 */
