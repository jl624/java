import java.util.Arrays;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * @Date: 2021/5/11
 * @Time: 14:21
 **/
public class TestHeap {
    public int[] elem;
    public int usedSize;
    public TestHeap(){
        this.elem = new int[10];
    }

    /**
     *
     * @param root 每颗子树的开始位置
     * @param len  结束位置
     */
    public void adjustDown(int root,int len){
        int parent = root;
        int child = 2*parent+1;
        while (child < len){
            //判断是否有右孩子，如果有，找到最大值，同时C下标为最大值下标
            if (child+1 < len && this.elem[child] < this.elem[child+1]){
                child++;
            }
            //代码执行到这，C表示最大值下标
            if (this.elem[child] > this.elem[parent]){
                //交换
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            }else{
                break;
            }
        }
    }
    public void createHeap(int[] array){
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }
        //i:每颗子树的节点下标
        for (int i = (this.usedSize-1-1)/2; i >= 0;i--){
            adjustDown(i,this.usedSize);
        }
    }
    public void push(int val){
        //堆是否是满的，若是，扩容
        if (isFUll()){
            this.elem = Arrays.copyOf(this.elem, 2*this.elem.length);
        }
        //放到数组的最后一个位置
        this.elem[this.usedSize] = val;
        this.usedSize++;
        //进行调整
        adjustUp(this.usedSize-1);
    }
    public void adjustUp(int child){
        int parent = (child-1)/2;
        while (child > 0){
            if (this.elem[child] > this.elem[parent]){
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                child = parent;
                parent = (child-1)/2;
            }else{
                break;
            }
        }
    }
    public boolean isFUll(){
        return this.usedSize == this.elem.length;
    }
    public void pop(){
        //是否是空的
        if (isEmpty()){
            return;
        }
        //最后一个元素和堆顶元素交换
        int tmp = this.elem[0];
        this.elem[0] = this.elem[this.usedSize-1];
        this.elem[this.usedSize-1] = tmp;
        this.usedSize--;
        //调整0号下标的这个树
        adjustDown(0,this.usedSize);
    }
    public boolean isEmpty(){
        return this.usedSize == 0;
    }
    public void show(){
        for (int i = 0; i < usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
}
