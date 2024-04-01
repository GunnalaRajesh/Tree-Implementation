package Trees.BinaryTree;

import java.util.Scanner;

public class BinaryTree {
    Node root;
    public BinaryTree(){
        this.root = null;
    }

    public static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
            this.left = this.right = null;
        }
        public int get(){
            return value;
        }
    }
    public void insert(Scanner sc){
        System.out.println("enter the root node");
        int data = sc.nextInt();
        root = new Node(data);
        insert(sc,root);
    }
    private void insert(Scanner sc, Node node){
        System.out.println("do you want to add left of "+node.get());
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("enter the value");
            int data = sc.nextInt();
            node.left = new Node(data);
            insert(sc,node.left);
        }
        System.out.println("do you want to add right of "+node.get());
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("enter the value");
            int data = sc.nextInt();
            node.right = new Node(data);
            insert(sc,node.right);
        }
    }
    public void display(){  // displaying elements in three traversals
        System.out.print("Inorder = ");
        inOrder(root);   // (left,root,right);
        System.out.println();
        System.out.print("preOrder = ");
        preOrder(root);  // (root,left,right);
        System.out.println();
        System.out.print("postOrder = ");
        postOrder(root);  // (left,right,root);
        System.out.println();

    }
    private void inOrder(Node root){ // Move to the entire left then prints the node, then move to the right along
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.get()+" ");
        inOrder(root.right);
    }
    private void preOrder(Node root){// prints the node first then move to the left of node then after completion move to the right
        if(root == null) return;
        System.out.print(root.get()+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    private void postOrder(Node root){  // move to the entire left then followed by right child after the call is over from both sides then print the node
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.get()+" ");
    }
}
