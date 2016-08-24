package challenge.datastructure;

import java.net.BindException;

/**
 * Created by Raj on 8/23/16.
 */
public class ElementSearch {


    public static void main(String args[]){

        BinaryNode l11 = new BinaryNode("L11", null ,null);
        BinaryNode l1 = new BinaryNode("L1", l11 ,null);
        BinaryNode r1 = new BinaryNode("R1", null ,null);
        BinaryNode root = new BinaryNode("R", l1, r1);

        System.out.println(hasValue(root, "R1"));
    }


    public static boolean hasValue(BinaryNode node, String value){

        if(node == null){
            return false;
        }

        if(node.value.equals(value)){
            return true;
        }

        return hasValue(node.left, value) || hasValue(node.right, value);
    }





}


class BinaryNode{

    public String value;
    public BinaryNode left;
    public BinaryNode right;


    public BinaryNode(String value, BinaryNode left, BinaryNode right){

        this.value = value;
        this.left = left;
        this.right = right;

    }



}