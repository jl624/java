/**
 * @program: BiTe2
 * @description:
 * @author: JINLEI
 * @data: 2021/3/6
 * @time: 15:58
 */

import java.util.Arrays;

/**
 * 顺序表
 */
public class MyArrayList {

    public int[] elem;//数组
    public int usedSize;//有效的数据个数
    public static  final  int Capacity = 10;//初始容量

    public MyArrayList(){
        this.elem = new int[Capacity];
        this.usedSize = 0;
    }

    private boolean isEmpty(){
        return this.usedSize == 0;
    }

    //更新pos位置的元素
    public void setPos(int pos, int value){
        if (pos < 0 || pos >= this.usedSize){
            throw new RuntimeException("pos位置不合法！");
        }
        this.elem[pos] = value;
    }

    //删除第一次出现的关键字toRemove
    public void remove(int toRemove){

        int index = search(toRemove);
        if (index == -1){
            System.out.println("没有需要删除的数字");
            return;
        }
        for (int i = index; i < this.usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;

    }

    //清空顺序表
    public void clear(){
        this.usedSize = 0;
    }


    //获取pos位置的元素
    public int getPos(int pos){
        //1、顺序表是否为空
        if (isEmpty()){
            //return -1;
            throw new RuntimeException("顺序表为空");//手动抛出异常
        }
        //2、pos的合法性
        checkPos(pos);
        /*if (pos < 0 || pos >= this.usedSize){
            return -1;
        }*/
        /*if (pos >= 0 && usedSize !=0 ){
            for (int i = 0; i < this.usedSize; i++) {
                if (pos == this.elem[i]){
                    //返回pos位置
                    return this.elem[pos ];
                }
            }
        }*/
        //return pos位置的数据
        return this.elem[pos];
    }

    //获取顺序表长度
    public int size(int length){
        return this.usedSize;
    }



    //判定是否包含某个元素
    public boolean contains(int toFind){
        for (int i = 0; i < this.usedSize; i++) {
            if (toFind == this.elem[i]){
                return true;
            }

        }
        return false;

    }
    //查找某个元素对应的位置
    public int search(int toFind){
        for (int i = 0; i < this.usedSize; i++) {
            if (toFind == this.elem[i]){
                return i;
            }
        }
        return -1;
    }

    //打印顺序表
    public void display(){
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+ " ");
        }
        System.out.println();
    }

    private Boolean isFull(){
        /*if (this.usedSize == this.elem.length){
            return true;
        }
        return false;*/
        return this.usedSize == this.elem.length;
    }

    private void checkPos(int pos){
        if (pos < 0 || pos > this.usedSize){
            throw new RuntimeException("pos位置不合法！");
        }
    }
    //在pos位置新增元素
    public void add(int pos, int data){
        if (isFull()){
            //扩容为原数组的二倍
            this.elem =
                    Arrays.copyOf(this.elem,2*this.elem.length);
        }

        checkPos(pos);
        /*if (pos < 0 || pos > this.usedSize){
            return;
        }*/
        //挪数据
        for (int i = this.usedSize-1; i >= pos;i--){
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
}
