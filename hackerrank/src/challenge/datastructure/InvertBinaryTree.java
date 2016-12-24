package challenge.datastructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Raj on 8/18/16.
 */

public class InvertBinaryTree {

    public static void main(String args[])
    {


        /**             R
         *
         *      L1               R1
         *
         * L11      L12     R11       R12
         *
         */

        TreeNode parent = new TreeNode("R");

        TreeNode l1 = new TreeNode("L1");
        TreeNode l2 = new TreeNode("L11");
        TreeNode l3 = new TreeNode("L12");

        TreeNode r1 = new TreeNode("R1");
        TreeNode r2 = new TreeNode("R11");
        TreeNode r3 = new TreeNode("R12");

        parent.left = l1;
        parent.right = r1;

        l1.left = l2;
        l1.right = l3;

        r1.left = r2;
        r1.right = r3;

        System.out.print("Original->");
        printBFS(parent);
        System.out.println("");
        System.out.print("Reversed->");
        printBFS(reverseTree(parent));
    }

    public static void printBFS(TreeNode tree)
    {
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();

        nodes.add(tree);

        while(!nodes.isEmpty()){

            TreeNode current = nodes.poll();

            System.out.print(current.name + " ");

            if(current.left != null){
                nodes.add(current.left);
            }
            if(current.right != null){
                nodes.add(current.right);
            }
        }
    }

    public static TreeNode reverseTree(TreeNode tree)
    {
        if(tree == null)
            return tree;

        TreeNode temp = tree.left;
        tree.left = tree.right;
        tree.right = temp;

        if(tree.left != null)
            reverseTree(tree.left);

        if(tree.right != null)
            reverseTree(tree.right);

        return tree;
    }
}

class TreeNode{

    TreeNode left;
    TreeNode right;
    String name;

    public TreeNode(String value){
        name  = value;
    }
}

