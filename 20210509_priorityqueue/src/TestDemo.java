import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * 优先级队列
 * @Date: 2021/5/9
 * @Time: 10:58
 **/
public class TestDemo {
    public static void main(String[] args) {
        TestHeap testHeap = new TestHeap();
        int[] array = {27,15,19,18,28,34,65,49,25,37};
        testHeap.createHeap(array);
        testHeap.show();
        testHeap.push(80);
        testHeap.show();
        testHeap.pop();
        testHeap.show();
    }
}
