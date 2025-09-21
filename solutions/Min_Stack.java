import java.util.Stack;

class MinStack {

    private Stack<Integer> stack = new Stack<>();

    public MinStack() {
         stack = new Stack<>;
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        Stack<Integer> tmp = new Stack<>;
        int mini = stack.peek();

        while(!stack.isEmpty()){
            mini = Math.min(mini, stack.peek());
            tmp.push(stack.pop());
        }
        while(!tmp.isEmpty()){
            stack.push(tmp.pop());
        }
        return mini;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */