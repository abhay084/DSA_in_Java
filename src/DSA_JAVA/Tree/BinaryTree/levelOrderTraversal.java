package DSA_JAVA.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversal {
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

    public void levelorder(TreeNode root){
        if (root == null){
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()){
            TreeNode temp = q.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null){
                q.offer(temp.left);
            }
            if (temp.right != null){
                q.offer(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        levelOrderTraversal lo = new levelOrderTraversal();
        lo.createBinaryTree();
        lo.levelorder(lo.root);

    }
}
