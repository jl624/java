import java.util.Stack;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * 括号匹配问题
 * @Date: 2021/4/8
 * @Time: 20:02
 **/
public class TestDemo {

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else {
                //1、判断栈是否为空
                if (stack.empty()){
                    System.out.println("右括号多！");
                    return false;
                }
                //先拿到栈顶元素的括号
                char ch1 = stack.peek();
                if (ch1 == '(' && ch == ')' || ch1 == '[' && ch == ']' || ch1 == '{' && ch == '}'){
                    stack.pop();
                }else {
                    System.out.println("左右括号不匹配！");
                    return false;
                }
            }
        }
        if (!stack.empty()){
            System.out.println("左括号多!");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
