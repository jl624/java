import java.util.Arrays;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * @Date: 2021/5/15
 * @Time: 11:59
 **/

public class TestSort {
    /**
     * 直接插入排序
     * 时间复杂度：O(n^2)  最好的情况(有序的情况)；O(n)
     *  重要：越有序越快
     * 空间复杂度：O(1)
     * 稳定性：稳定
     * 总结：
     *      如果一个排序是稳定的排序，那么他就可以变为不稳定的排序，
     *      但是如果一个排序本身不稳定，是不可能把他变为稳定的排序。
     *      稳定的排序在比较的过程中没有跳跃式的交换，
     * @param array
     */
    public static void insertSort(int[] array){
        int tmp = 0;
        for (int i = 1; i < array.length; i++) {
            tmp = array[i];
            int j;
            for (j = i-1;  j >=0 ; j--) {
                if (array[j] > tmp){
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    /**
     * 希尔排序
     * 时间复杂度：最好O(n)   最坏O(n^2)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     * @param array
     */
    public static void shellSort(int[] array){
        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }
    }
    //shell函数就是一个直接插入排序
    public static void shell(int[] array,int gap){
        int tmp = 0;
        for (int i = gap; i < array.length; i++) {
            tmp = array[i];
            int j;
            for (j = i-gap;  j >=0 ; j-=gap) {
                if (array[j] > tmp){
                    array[j+gap] = array[j];
                }else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }

    /**
     * 选择排序
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     * @param array
     */
    public static void selectSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[j] < array[i]){
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {10,5,8,4,1,9};
        System.out.println(Arrays.toString(array));
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
