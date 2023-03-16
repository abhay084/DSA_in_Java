package DSA_JAVA.Tree.BinaryTree;


// Pre Order Binary traversal
// First Visit the root Node
// Traverse the left Subtree in Pre-order fashion
// Traverse the right Sub-Tree in Pre-order fashion

public class PreOrderTraversal {
    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

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

        root = first;
        first.left = sec;
        first.right = third;
        sec.left = fourth;
        sec.right = fifth;

    }

    public void PreOrder(TreeNode root){
        if (root == null){
            return;
        }
        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void main(String[] args) {

        PreOrderTraversal po = new PreOrderTraversal();
        po.createBinaryTree();
        po.PreOrder(po.root);


    }

}
