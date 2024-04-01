package Trees.BinarySearchTree;

public class BST {
    public static void main(String[] args) {
        BinarySearchTrees tree = new BinarySearchTrees();
        tree.isEmpty();
        tree.insert(15);
        tree.insert(10);
        tree.insert(20);
        tree.insert(5);
        tree.insert(12);
        tree.isEmpty();
        tree.display();
        tree.search(10);
        tree.isBalanced();

    }
}
