
/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * 测试
 * @Date: 2021/4/25
 * @Time: 11:42
 **/
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree();
        binaryTree.preOrderTraversal(root);
        System.out.println();
        System.out.println("=====前序遍历非递归======");
        binaryTree.preOrderTraversalNor(root);

        binaryTree.inOrderTraversal(root);
        System.out.println();
        System.out.println("=====中序遍历非递归======");
        binaryTree.inOrderTraversalNor(root);

        binaryTree.postOrderTraversal(root);
        System.out.println();
        System.out.println("=====后序遍历非递归======");
        binaryTree.postOrderTraversalNor(root);

        binaryTree.getSize1(root);
        System.out.println("1节点数为：" + BinaryTree.size);
        binaryTree.getSize2(root);
        System.out.println("2节点数为：" + BinaryTree.size);

        binaryTree.getLeafSize1(root);
        System.out.println("叶子结点个数：" + BinaryTree.leafSize);
        System.out.println("========层序遍历========");
        binaryTree.leveOrderTraversal(root);
        System.out.println("是否是完全二叉树：");
        System.out.println(binaryTree.isCompleteTree(root));
    }
}
