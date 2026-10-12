import java.util.*;

class BuildTreeBasics {

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public TreeNode buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1) return null; 

            TreeNode newNode = new TreeNode(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void levelOrder(TreeNode root){
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            System.out.print(curr.data + " ");
            if(curr.left != null) q.offer(curr.left);
            if(curr.right != null) q.offer(curr.right);
        }

    }

    
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.buildTree(nodes);
        System.out.println(root);  //Print root.data to see the data at memory location

        levelOrder(root);
    }
}
