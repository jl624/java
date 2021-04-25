/**
 * @program: BiTe2
 * @description:
 * @author: JINLEI
 * @data: 2021/3/6
 * @time: 15:35
 */
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            myArrayList1.add(i,i);
        }
        myArrayList1.display();
        myArrayList1.add(10,112);
        myArrayList1.display();

        myArrayList1.remove(5);
        myArrayList1.display();
        myArrayList1.setPos(5,15);
        myArrayList1.display();

        myArrayList1.clear();
        myArrayList1.display();
        /*System.out.println("==========================");
        System.out.println(myArrayList1.search(51));
        System.out.println(myArrayList1.contains(15));*/

    }
}
