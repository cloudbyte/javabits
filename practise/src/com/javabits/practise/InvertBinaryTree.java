package com.javabits.practise;

/**
 * Created by Raj on 2/8/16.
 */
public class InvertBinaryTree {


    public static void main(String args[])
    {


        /**
         *              6
         *      2               8
         *
         *          3       7       9
         *
         */

        Node parent = new Node(6);

        Node l1 = new Node(2);
        Node l2 = new Node(3);

        Node r1 = new Node(8);
        Node r2 = new Node(7);
        Node r3 = new Node(9);

        parent.left = l1;
        parent.right = r1;
        l1.right = l2;

        r1.left = r2;
        r1.right = r3;

        print(parent);

        System.out.println("Reversed->");

        print(reverseTree(parent));

    }


    public static void print(Node tree)
    {

        if(tree == null)
            return;

        if(tree.left != null)
            print(tree.left);


        if(tree.right != null)
            print(tree.right);

        if(tree.left == null && tree.right == null)


    }


    public static Node reverseTree(Node tree)
    {

        if(tree == null)
            return tree;

        Node temp = tree.left;
        tree.left = tree.right;
        tree.right = temp;

        if(tree.left != null)
            reverseTree(tree.left);

        if(tree.right != null)
            reverseTree(tree.right);



        return tree;

    }

}

class Node{

    Node left;
    Node right;
    int val;

    public Node(int value){
        val  = value;
    }
}


