/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * @Date: 2021/5/7
 * @Time: 10:34
 **/
class Node{
    public Node left;
    public Node right;
    public char val;
    public Node(char val){
        this.val = val;
    }
}
public class BinaryTree {

    public Node buildTree(){
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        B.left = D;
        B.right = E;
        //E.right = H;
        A.right = C;
        C.left = F;
        C.right = G;
        return A;
    }
    //二叉搜索树转换为一个排序的双向链表
    public Node prev = null;
    public void ConvertChild(Node pCur){
        if (pCur == null){
            return;
        }
        ConvertChild(pCur.left);
        pCur.left = prev;
        if (prev != null){
            prev.right = pCur;
        }
        prev = pCur;
        ConvertChild(pCur.right);
    }

    public Node Convert(Node pRootOfTree) {
        if (pRootOfTree == null){
            return null;
        }
        ConvertChild(pRootOfTree);
        Node head =pRootOfTree;
        while (head.left != null){
            head = head.left;
        }
        return head;
    }
}
