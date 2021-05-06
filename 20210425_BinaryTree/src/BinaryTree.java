import java.util.*;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * 二叉树的基本操作
 * @Date: 2021/4/25
 * @Time: 11:42
 **/

class Node{
    public char val;
    public Node left;//左子树
    public Node right;//右子树
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
    //前序遍历
    void preOrderTraversal(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    //中序遍历
    void inOrderTraversal(Node root){
        if (root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }
    //后序遍历
    void postOrderTraversal(Node root){
        if (root == null){
            return;
        }
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
        System.out.println(root.val+" ");
    }
    //求结点个数-遍历思路-前序遍历
    static int size = 0;
    void getSize1(Node root){
        if (root == null){
            return;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);
    }
    //子问题思路-求解结点个数
    int getSize2(Node root){
        if (root == null){
            return 0;
        }
        return getSize2(root.left) + getSize2(root.right) + 1;
    }
    //遍历思路-求叶子结点个数
    static int leafSize = 0;
    void getLeafSize1(Node root){
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null){
            leafSize++;
        }else {
            getLeafSize1(root.left);
            getLeafSize1(root.right);
        }
    }
    //子问题思路-求叶子节点的个数
    int getLeafSize2(Node root){
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }
    //层序遍历
    void leveOrderTraversal(Node root){
        if (root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            if (cur != null) {
                System.out.print(cur.val + " ");
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
        }
        System.out.println();
    }
    //把每一层的数据放到一个list， 然后将这些list放到一个大的list中
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ret = new LinkedList<>();
        if (root == null){
            return ret;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            //求当前队列的大小
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            //while(size>0)来控制当前每一层的数据个数
            while (size > 0){
                Node cur = queue.poll();
                if (cur != null) {
                    //list.add(cur.val);
                    if (cur.left != null) {
                        queue.offer(cur.left);
                    }
                    if (cur.right != null) {
                        queue.offer(cur.right);
                    }
                }
                size--;
            }
            ret.add(list);
        }
        return ret;
    }
    //判断一棵树是否是完全二叉树
    boolean isCompleteTree(Node root){
        if (root == null){
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            if (cur != null){
                queue.offer(cur.left);
                queue.offer(cur.right);
            }else {
                break;
            }
        }
        //看队列里面是否都为空
        while (!queue.isEmpty()){
            Node cur2 = queue.peek();
            if (cur2 != null){
                return false;
            }else {
                queue.poll();
            }
        }
        return true;
    }
    //前序遍历非递归
    void preOrderTraversalNor(Node root){
        if (root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while (cur != null || !stack.empty()){
            while (cur != null){
                stack.push(cur);
                System.out.print(cur.val+" ");
                cur = cur.left;
            }
            Node top = stack.pop();
            cur = top.right;
        }
        System.out.println();
    }
    //中序遍历非递归
    void inOrderTraversalNor(Node root){
        if (root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while (cur != null || !stack.empty()){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.pop();
            System.out.print(top.val+" ");
            cur = top.right;
        }
        System.out.println();
    }
    //后序遍历非递归
    void postOrderTraversalNor(Node root){
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        Node prev = null;
        while(cur != null || !stack.empty()) {
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if (cur.right == null || cur.right == prev){
                System.out.print(cur.val+ " ");
                stack.pop();
                prev = cur;
                cur = null;
            }else {
                cur = cur.right;
            }
        }
        System.out.println();
    }
    //找两个指定节点的公共祖先
    public Node lowestCommonAncestor(Node root, Node p, Node q){
        if (root == null) return null;
        if (root == p || root == q){
            return root;
        }
        Node left = lowestCommonAncestor(root.left, p,q);
        Node right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null){
            return root;
        }else if (left != null){
            return left;
        }else {
            return right;
        }
    }
}
