import java.util.Stack;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * 栈和队列
 * @Date: 2021/4/7
 * @Time: 10:42
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        System.out.println(myQueue.peek());//1
        System.out.println(myQueue.poll());//1
        System.out.println(myQueue.peek());//2
    }
    public static void main2(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.peek()); //3
        System.out.println(myStack.pop()); //3
        System.out.println(myStack.peek()); //2
    }
    public static void main1(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.peek());//显示栈顶元素
        stack.pop();//删除栈顶元素
        System.out.println(stack);
        System.out.println(stack.empty());//判断是否为空
        System.out.println(stack.search(1));//可以看作数组，从栈顶往下依次4 3 2 1 0 所以返回4

    }

}
