package DSA_JAVA.Tree.BinaryTree;

// Post Order Binary Tree Traversal

// 1. visit left subtree completely
// 2. visit right subtree completely
// 3. visit root node

public class PostOrder {
    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode right;
        private TreeNode left;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(10);
        TreeNode sec = new TreeNode(20);
        TreeNode third = new TreeNode(30);
        TreeNode fourth = new TreeNode(40);
        TreeNode fifth = new TreeNode(50);
        TreeNode six = new TreeNode(60);
        TreeNode seven = new TreeNode(70);

        root = first;
        first.left = sec;
        first.right = third;
        sec.left = fourth;
        sec.right = fifth;
        third.left = six;
        third.right = seven;
    }

    public void PrintPostOrder(TreeNode root){
        if (root == null){
            return;
        }
        PrintPostOrder(root.right);
        PrintPostOrder(root.left);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        PostOrder po = new PostOrder();
        po.createBinaryTree();
        po.PrintPostOrder(po.root);
    }
}
