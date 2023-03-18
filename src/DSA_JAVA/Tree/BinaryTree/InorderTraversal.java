package DSA_JAVA.Tree.BinaryTree;

// In Order tree traversal
// 1. Travel the left subtree in InOrder fashion
// 2. Visit the root Node
// 3. traverse the right sub tree

public class InorderTraversal {

    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode right;
        private TreeNode left;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void createBinaryTree(){
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

    public void InOrder(TreeNode root){
        if (root == null){
            return;
        }
        if (root.left != null){
            InOrder(root.left);
        }
        System.out.print(root.data + " ");
        InOrder(root.right);

    }

    public static void main(String[] args) {
        InorderTraversal it = new InorderTraversal();

        it.createBinaryTree();
        it.InOrder(it.root);
    }
}
