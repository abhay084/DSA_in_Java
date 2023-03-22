package DSA_JAVA.Tree.BinaryTree;

import com.sun.source.tree.Tree;

public class BinarySearchTree {

    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public TreeNode insert(TreeNode root,int value){
        if (root == null){
            root = new TreeNode(value);
            return root;
        }

        if (value < root.data){
            root.left = insert(root.left,value);
        }
        else{
            root.right = insert(root.right, value);
        }
        return root;
    }

    public TreeNode SearchKey(TreeNode root,int key){
        if (root == null || root.data == key){
            return root;
        }

        if (key < root.data){
            return SearchKey(root.left,key);
        }
        else {
            return SearchKey(root.right,key);
        }
    }

    public void InOrder(TreeNode root){
        if (root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);

    }

    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        bt.root = bt.insert(bt.root, 10);
        bt.insert(bt.root,-12);
        bt.insert(bt.root,43);
        bt.insert(bt.root, 123);

        bt.InOrder(bt.root);
        System.out.println();
        bt.SearchKey(bt.root,123);

    }
}
