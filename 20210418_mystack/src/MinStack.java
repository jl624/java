import java.util.Stack;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * @Date: 2021/4/21
 * @Time: 9:49
 **/
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.empty()){
            //最小栈没有元素
            minStack.push(val);
        }else {
            //最小栈内有元素，拿到栈顶元素和val比较
            int top = minStack.peek();
            if (val < top){
                minStack.push(val);
            }
        }
    }

    public void pop() {
        if (!stack.isEmpty()){
            int tmp = stack.pop();
            if (tmp == minStack.peek()){
                minStack.pop();
            }
        }
    }
    //拿到栈顶元素不删除
    public int top() {
        if (stack.empty()){
            return -1;
        }
        return stack.peek();
    }

    public int getMin() {
        if (minStack.empty()){
            return -1;
        }
        return minStack.peek();
    }
}
