package DSA_JAVA.Tree.BinaryTree;

public class BinaryTreeRepresentation {

    private TreeNode root;
    private TreeNode leaf;

    private class TreeNode{
        private int data;  //Any Generic Type can be used instead of int
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

    public static void main(String[] args) {

        BinaryTreeRepresentation bt = new BinaryTreeRepresentation();

        bt.createBinaryTree();

    }
}
