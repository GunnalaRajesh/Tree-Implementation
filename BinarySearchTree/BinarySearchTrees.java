package Trees.BinarySearchTree;

//creating implementing Binary Search tree
class BinarySearchTrees{
    Node root;
    public BinarySearchTrees(){
        this.root = null;
    }
    //creating Node such that every node has left and right links

    public static class Node{
        int value,height;
        Node left, right;
        public Node(int value){
            this.value = value;
            this.left = this.right = null;
        }
        public int get(){
            return value;
        }
    }
    public int height(Node node){
        if(node == null) return -1;
        return node.height;
    }
    public void isEmpty(){
        System.out.println(root==null);
    }
//    Inserting the values to the Binary Search tree from root node.
    public void insert(int value){
        root = recurrenceInsertion(root,value);
    }
    private Node recurrenceInsertion(Node node, int data){
        if(node == null){  // in BST every node has a condition such that new element should compare with the current node
            node = new Node(data);
            return node;
        }  // according to the comparison smaller elements to the left side, greater are right.
        if(data < node.get()) node.left = recurrenceInsertion(node.left,data);
        if(data > node.get()) node.right = recurrenceInsertion(node.right,data);
        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;
    }

    public void search(int target){
        System.out.println(search(root,target));
    }
    private boolean search(Node node, int target){
        if(node == null) return false;
        if(node.value == target) return true;
        if(node.value > target) return search(node.left, target);
        else return search(node.right, target);
    }
    public void isBalanced(){
        System.out.println(isBalanced(root));
    }
    public boolean isBalanced(Node node){
        if(node == null) return true;
        return Math.abs(height(node.left)-height(node.right)) <=1 && isBalanced(node.left) && isBalanced(node.right);
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
        System.out.println("Height = "+height(root));

    }
    private void inOrder(Node root){ // Move to the entire left then prints the node, then move to the right along
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.value+" ");
        inOrder(root.right);
    }
    private void preOrder(Node root){// prints the node first then move to the left of node then after completion move to the right
        if(root == null) return;
        System.out.print(root.value+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    private void postOrder(Node root){  // move to the entire left then followed by right child after the call is over from both sides then print the node
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value+" ");
    }

}